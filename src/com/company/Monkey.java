package com.company;

public class Monkey implements Climbable,Eatable {
    Koala koala;

    public Monkey(){

    }

    public Monkey(Koala koala) {
        this.koala = koala;
    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing");
    }

    @Override
    public void eat() {
        System.out.println("Monkey is eating edible fruits");
    }

    public Koala getKoala() {
        return koala;
    }

    public void setKoala(Koala koala) {
        this.koala = koala;
    }
}
