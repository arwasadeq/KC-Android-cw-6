package com.mohammedev.androidschool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class StudentAdapter extends ArrayAdapter<Student> {
    public StudentAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Student currentStudent = getItem(position);

        TextView name = view.findViewById(R.id.studentName);
        name.setText("studentname: "+currentStudent.getStudentname());

        TextView age = view.findViewById(R.id.studentAge);
        age.setText("studentage: "+currentStudent.getStudentage()+"");

        TextView grade = view.findViewById(R.id.studentGrade);
        grade.setText("studentgrade: "+currentStudent.getStudentgrade()+"");

        ImageView image = view.findViewById(R.id.studentImage);
        image.setImageResource(currentStudent.getStudentphoto());
        return view;
    }
}