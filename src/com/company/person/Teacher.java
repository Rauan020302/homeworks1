package com.company.person;

import com.company.person.Person;

import java.time.LocalDate;

public class Teacher extends Person {
    private String typeofWork;

    public Teacher(){}

    public Teacher(LocalDate date, String surname, String name, String genner, int age, String typeofWork) {
        super(date, surname, name, genner, age);
        this.typeofWork = typeofWork;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "typeofWork='" + typeofWork + '\'' +
                ", date=" + date +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", genner='" + genner + '\'' +
                ", age=" + age +
                '}';
    }

    public String getTypeofWork() {
        return typeofWork;
    }

    public void setTypeofWork(String typeofWork) {
        this.typeofWork = typeofWork;
    }
}
