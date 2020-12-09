package com.company;

import org.w3c.dom.ls.LSOutput;

public class OnlineStore {
    String name;
    String product;
    int numProduct;
    double delivery;
    int speed;
    double tax;
    double riskOfLoss;
    public OnlineStore(){}

    public OnlineStore(String name,String product,int numProduct,double delivery, int speed, double tax, double riskOfLoss) {
        this.name = name;
        this.product = product;
        this.numProduct = numProduct;
        this.delivery = delivery;
        this.speed = speed;
        this.tax = tax;
        this.riskOfLoss = riskOfLoss;
    }
    public double sale(String product,int numProduct){
        double sum = (numProduct * delivery)-(numProduct * delivery * tax);

        System.out.println("Продается " + product + " в количестве - " + numProduct + " штук");

        if(sum > 10000){
            System.out.println("Риск потерять в %:");
            System.out.println("Ozon - 20%, Amazon - 5%, Alibaba - 14% ");
            System.out.println("Вам лучше выбрать Amazon ");

        }
        System.out.print("Сумма - ");
        return sum;
    }
    public void delivery(String product,int speed){
        System.out.println("Доставка - " + product + " за " + speed + " дней");

        System.out.println("Спасибо за ваш заказ, приходите еще!");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumProduct() {
        return numProduct;
    }

    public void setNumProduct(int numProduct) {
        this.numProduct = numProduct;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getDelivery() {
        return delivery;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getRiskOfLoss() {
        return riskOfLoss;
    }

    public void setRiskOfLoss(double riskOfLoss) {
        this.riskOfLoss = riskOfLoss;
    }
}

