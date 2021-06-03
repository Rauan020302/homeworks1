package com.company.secondway;

public class CalculatorSecond implements Calculator{

    public void degree(){
        System.out.println("a^b");
    }

    @Override
    public void plus() {
        System.out.println("+");
    }

    @Override
    public void minus() {
        System.out.println("-");
    }

    @Override
    public void divide() {
        System.out.println("/");
    }

    @Override
    public void multiplication() {
        System.out.println("*");
    }
}
