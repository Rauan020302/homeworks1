package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Lessons {
    LocalDate date;
    Teacher teacher;
    Student[] student;
    Course course;
    LocalTime time;
    boolean hw;
    boolean exam;
    public Lessons(){
    }

    public Lessons(LocalDate date,Teacher teacher, Student[] student ,Course course , LocalTime time, boolean hw, boolean exam) {
        this.date    =    date;
        this.teacher = teacher;
        this.student = student;
        this.course  =  course;
        this.time    =    time;
        this.hw      =      hw;
        this.exam    =    exam;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "date=" + date +
                ", teacher=" + teacher +
                ",\n student=" + Arrays.toString(student) +
                ",\n course='" + course + '\'' +
                ", time=" + time +
                ", hw=" + hw +
                ", exam=" + exam +
                "}";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }



    public boolean isHw() {
        return hw;
    }

    public void setHw(boolean hw) {
        this.hw = hw;
    }

    public boolean isExam() {
        return exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }
}
