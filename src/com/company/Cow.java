package com.company;

public class Cow {
    int weight;
    int age;
    String genner;
    String nickname;

    public Cow(){

    }

    public Cow(int weight, int age, String genner, String nickname) {
        this.weight = weight;
        this.age = age;
        this.genner = genner;
        this.nickname = nickname;
    }

public void printInfo(){
    System.out.println("Cow: ");
    System.out.println("weight - " + weight + ", age - " + age + ", genner - " + genner + ", nickname - " + nickname);
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
