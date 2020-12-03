package com.company;

public class Furniture {
    int price;
    String producer;
    String material;

    public Furniture() {
    }

    public Furniture(int price, String producer, String material) {
        this.price = price;
        this.producer = producer;
        this.material = material;
    }


    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", producer='" + producer + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
