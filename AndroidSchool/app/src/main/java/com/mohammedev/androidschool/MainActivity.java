package com.mohammedev.androidschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //student  s1 , s2 , s3
    //index  0 , 1 , 2
    ArrayList<Student> students = new ArrayList<>();
    int cuurentStudent = 0;


            //String studentname, int studentage, int studentphoto, int studentgrade
    Student S1 = new Student("anas",19,R.drawable.boy,12);
    Student S2 = new Student("ameer",17,R.drawable.boy1,11);
    Student S3 = new Student("adham",18,R.drawable.boy2,12);






    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);
        
        students.add(S1);
        students.add(S2);
        students.add(S3);


        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */



        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}