package com.baetiong.lab2baetiongraphael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        userInput = findViewById(R.id.editText1);
        this.setTitle("Validate");
    }

    public void goBack(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void validate(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);

        String CourseFirst = sp.getString("etCourseA",null);
        String CourseSecond = sp.getString("etCourseB",null);
        String CourseThird = sp.getString("etCourseC",null);
        String CourseFourth = sp.getString("etCourseD",null);
        String CourseFifth = sp.getString("etCourseE",null);
        String CourseSixth = sp.getString("etCourseF",null);
        String CourseSeventh = sp.getString("etCourseG",null);
        String CourseEighth = sp.getString("etCourseH",null);

        String courseInput = userInput.getText().toString();

        if(courseInput.equals(CourseFirst) || courseInput.equals(CourseSecond) || courseInput.equals(CourseThird) || courseInput.equals(CourseFourth) || courseInput.equals(CourseFifth) || courseInput.equals(CourseSixth) || courseInput.equals(CourseSeventh) || courseInput.equals(CourseEighth)) {
            Toast.makeText(this, "Course is offered in UST", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Course is NOT offered in UST", Toast.LENGTH_LONG).show();
        }
    }
}
