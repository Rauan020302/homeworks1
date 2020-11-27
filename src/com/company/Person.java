package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Person {
    String name;
    String surname;
    String middleName;
    int birthYear;
    String hobby;
    String genner;
    int currentYear = LocalDate.now().getYear();


    public Person(){

    }

    public Person(String name,String surname,int birthYear){
        this.name= name;
        this.surname =surname;
        this.birthYear =birthYear;
    }
    public Person(String name,String surname,String middleName,int birthYear,String hobby,String genner){
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.hobby = hobby;
        this.genner = genner;
    }
    public Person(String name,String surname,String middleName,int birthYear,String genner){
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.genner = genner;
    }
    public void aboutMySelf(){
        if(hobby != null && genner != null) {
            System.out.println("My full name is " + getSurname() + " " + getName() + " " + getMiddleName() + ".I am " + (LocalDate.now().getYear() - getBirthYear())
                    + " years old, my hobby is " + getHobby() + " and I am " + getGenner() + ". ");
        }else if(genner != null){
            System.out.println("My full name is " + getSurname() + " " + getName() + " " + getMiddleName() + ".I am " + (LocalDate.now().getYear() - getBirthYear())
                    + " years old, and I am " + getGenner() + ". ");
        }
        else {
            System.out.println("My full name is " + getSurname() + " " + getName() + ".I am " + (LocalDate.now().getYear() - getBirthYear())
                    + " years old. ");
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public String getMiddleName(){
        return middleName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;

    }
    public int getBirthYear(){
        return birthYear;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }

    public void setGenner(String genner){
        this.genner = genner;
    }
    public String getGenner(){
        return genner;
    }








}
