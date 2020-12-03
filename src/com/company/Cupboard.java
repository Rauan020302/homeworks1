package com.company;

public class Cupboard  extends Furniture{
    double height;
    String type;


    public Cupboard(){}


    public Cupboard(int price, String producer, String material, double height, String type) {
        super(price, producer, material);
        this.height = height;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "height=" + height +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String  getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
