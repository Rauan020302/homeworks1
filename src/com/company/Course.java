package com.company;

import java.time.LocalDate;

public class Course {
    String name;
    LocalDate date;
    String id;
    String fullName;

    public Course(){

    }

    public Course(String name, LocalDate date,String id,String fullName){
        this.name = name;
        this.date = date;
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
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
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }

}
