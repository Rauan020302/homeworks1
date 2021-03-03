package com.company;

public class Car {
    private int carId;
    private int manufactureYear;
    private String model;
    private int price;
    private String color;
    public Car(){

    }
    public Car(int carId, int manufactureYear, String model, int price, String color) {
        this.carId = carId;
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "carId=" + carId +
                ", manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                "}\n";
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
