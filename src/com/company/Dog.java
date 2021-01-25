package com.company;

public class Dog {
    private String name;
    private int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + weight;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Dog){
            Dog dog = (Dog)obj;
            return dog.getName().equals(this.getName()) &&
                    dog.getWeight() == this.getWeight();
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
