package com.company;

public class Horse {
    int weight;
    int age;
    String color;
    String genner;
    String nickname;

    public Horse(){

    }

    public Horse(int weight, int age, String color, String genner, String nickname) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.genner = genner;
        this.nickname = nickname;
    }

    public void printInfo(){
        System.out.println("Horse: ");
        System.out.println("wight - " + weight + ", age - " + age + ", color - " + color + ", genner - " + genner + ", nickname - " + nickname);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("age cannot be negative");
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenner() {
        return genner;
    }

    public void setGenner(String genner) {
        this.genner = genner;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
