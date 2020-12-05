package com.company.person;

import com.company.person.Person;

import java.time.LocalDate;

public class Student extends Person {
    private int card;

    public Student(){}

    public Student(LocalDate date, String surname, String name, String genner, int age, int card) {
        super(date, surname, name, genner, age);
        this.card = card;
    }

    @Override
    public String toString() {
        return "Student{" +
                "date=" + date +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", genner='" + genner + '\'' +
                ", age='" + age + '\'' +
                ", card=" + card +
                "}";

    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }
}
