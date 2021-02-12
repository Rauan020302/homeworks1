package com.company;

import java.sql.Timestamp;

public class People {
    private int id;
    private String name;
    private Timestamp birthDay;

    public People(int id, String name, Timestamp birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }



    @Override
    public String toString() {
        return  "\nid = "       + id +
                "\nname = "     + name +
                "\nbirthDay = " + birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Timestamp birthDay) {
        this.birthDay = birthDay;
    }
}
