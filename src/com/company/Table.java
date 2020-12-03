package com.company;

public class Table extends Furniture{
    int leg;
    double square;

    public Table(){}

    public Table(int price, String producer, String material, int leg, double square) {
        super(price, producer, material);
        this.leg = leg;
        this.square = square;
    }

    @Override
    public String toString() {
        return "Table{" +
                "leg=" + leg +
                ", square=" + square +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
