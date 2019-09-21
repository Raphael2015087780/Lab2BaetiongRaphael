package com.baetiong.lab2baetiongraphael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {
    EditText etCourse1, etCourse2, etCourse3, etCourse4, etCourse5,etCourse6,etCourse7,etCourse8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCourse1 = findViewById(R.id.etCourse1);
        etCourse2 = findViewById(R.id.etCourse2);
        etCourse3 = findViewById(R.id.etCourse3);
        etCourse4 = findViewById(R.id.etCourse4);
        etCourse5 = findViewById(R.id.etCourse5);
        etCourse6 = findViewById(R.id.etCourse6);
        etCourse7 = findViewById(R.id.etCourse7);
        etCourse8 = findViewById(R.id.etCourse8);
    }

    public void saveData(View view) {
        SharedPreferences sp = getSharedPreferences("mydata", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String etCourseA = etCourse1.getText().toString();
        String etCourseB = etCourse2.getText().toString();
        String etCourseC = etCourse3.getText().toString();
        String etCourseD = etCourse4.getText().toString();
        String etCourseE = etCourse5.getText().toString();
        String etCourseF = etCourse6.getText().toString();
        String etCourseG = etCourse7.getText().toString();
        String etCourseH = etCourse8.getText().toString();
        editor.putString("etCourseA", etCourseA);
        editor.putString("etCourseB", etCourseB);
        editor.putString("etCourseC", etCourseC);
        editor.putString("etCourseD", etCourseD);
        editor.putString("etCourseE", etCourseE);
        editor.putString("etCourseF", etCourseF);
        editor.putString("etCourseG", etCourseG);
        editor.putString("etCourseH", etCourseH);
        editor.commit();
        Toast.makeText(this, "Courses were saved", Toast.LENGTH_LONG).show();

    }

    public void goNext(View view){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
