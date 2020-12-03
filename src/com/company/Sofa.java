package com.company;

public class Sofa extends Furniture{
    int numOfPlace;


    public Sofa(){

    }

    public Sofa(int price, String producer, String material, int numOfPlace) {
        super(price, producer, material);
        this.numOfPlace = numOfPlace;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "numOfPlace=" + numOfPlace +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public int getNumOfPlace() {
        return numOfPlace;
    }

    public void setNumOfPlace(int numOfPlace) {
        this.numOfPlace = numOfPlace;
    }
}
