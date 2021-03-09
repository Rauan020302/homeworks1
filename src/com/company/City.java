package com.company;

public class City implements Comparable<City>{
    private int code;
    private String name;

    public City(){

    }
    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        if (this.code == city.getCode())return 0;
        else if (this.code < city.getCode())return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
