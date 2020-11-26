package com.company;

import java.time.LocalDate;

public class Group {
    String name;
    LocalDate date;
    int month;

    public Group(){

    }
    public Group(String name, LocalDate date, int month){
        this.name = name;
        this.date = date;
        this.month = month;
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
