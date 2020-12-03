package com.company;

import java.time.LocalDate;

public class Person {
    LocalDate date;
    String surname;
    String name;
    String genner;
    int age;

    public Person(){

    }
    public Person(LocalDate date,String surname,String name,String genner,int age){
        this.date = date;
        this.surname = surname;
        this.name = name;
        this.genner = genner;
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenner() {
        return genner;
    }

    public void setGenner(String genner) {
        this.genner = genner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
