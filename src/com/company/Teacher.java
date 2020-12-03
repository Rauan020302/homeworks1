package com.company;

import java.time.LocalDate;

public class Teacher extends Person {
    String typeofWork;

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
}
