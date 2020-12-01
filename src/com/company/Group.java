package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    String name;
    Student[] students;
    Course courses;
    LocalDate date;
    int month;

    public Group(){

    }

    public Group(String name, Student[] students, Course courses, LocalDate date, int month) {
        this.name = name;
        this.students = students;
        this.courses = courses;
        this.date = date;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", courses=" + courses +
                ", date=" + date +
                ", month=" + month +
                '}';
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
    public LocalDate getDate(){
        return date;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
}

