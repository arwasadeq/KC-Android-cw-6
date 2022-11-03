package com.mohammedev.androidschool;

public class Student {
    private String studentname;
    private int studentage;
    private int studentphoto;
    private int studentgrade;


    public Student(String studentname, int studentage, int studentphoto, int studentgrade) {
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentphoto = studentphoto;
        this.studentgrade = studentgrade;
    }


    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(int studentphoto) {
        this.studentphoto = studentphoto;
    }

    public int getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }
}
