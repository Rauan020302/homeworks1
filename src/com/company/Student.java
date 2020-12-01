package com.company;

import java.time.LocalDate;

public class Student {
    LocalDate date;
    String surname;
    String name;
    String genner;
    int age;

    public Student(){

    }
    public Student(LocalDate date,String surname,String name,String genner,int age){
        this.date = date;
        this.surname = surname;
        this.name = name;
        this.genner = genner;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "date=" + date +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", genner='" + genner + '\'' +
                ", age=" + age +
                "}";

    }

    public void setDate(LocalDate date){
        this.date = date;
    }
    public LocalDate getDate(){
        return date;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGenner(String genner){
        this.genner = genner;
    }
    public String getGenner(){
        return genner;
    }
    public void setAge(int age){
        if(age < 0){
            System.out.println("age cannot be negative");
            return;
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
