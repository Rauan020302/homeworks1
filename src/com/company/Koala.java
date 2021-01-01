package com.company;

public class Koala implements Climbable,Eatable {

    @Override
    public void climb() {
        System.out.println("Koala is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Koala is eating");
    }
}
