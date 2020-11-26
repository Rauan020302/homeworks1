package com.company;

public class Cat {
    int age;
    String type;
    String color;

    public void setAge(int a){
        if(a <= 0){
            System.out.println("age cannot be negative");
            return;
        }
        age = a;
    }

    public void setType(String t){
        type = t;
    }
    public void setColor(String c){
        color = c;
    }

    public int getAge(){return age;}
    public String getType(){return type;}
    public String getColor(){return color;}
}
