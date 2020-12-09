package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Что хотите купить?");
        String product = sc.nextLine();
        System.out.println("Укажите количество ");
        int num = sc.nextInt();
        OnlineStore ozon = new OnlineStore("Ozon",product,num,20,5,0.05,0.2);
        OnlineStore alibaba = new OnlineStore("Alibaba",product,num,10,9,0.15,0.14);
        OnlineStore amazon = new OnlineStore("Amazon",product,num,35,14,0.15,0.05);
        System.out.println("Выберите на каком сайте хотите сделать заказ? 1,2 или 3");
        System.out.println("(1)Ozon доставка 1шт- " + ozon.delivery + ", скорость в днях - " + ozon.speed + ", налог - " + ozon.tax + '%');
        System.out.println("(2)Alibaba доставка 1шт- " + alibaba.delivery + ", скорость в днях - " + alibaba.speed + ", налог - " + alibaba.tax + '%');
        System.out.println("(3)Amazon доставка 1шт- " + amazon.delivery + ", скорость в днях - " + amazon.speed + ", налог " + amazon.tax + '%');
        int name = sc.nextInt();

        if(name == 1 ){
            if(num < 500) {
                System.out.println(ozon.sale(product, num));
                ozon.delivery(product, ozon.speed);
            }else{
                System.out.println("У вас есть риск потерять деньги риск -" +ozon.riskOfLoss + " вам лучше использовать " + amazon.name);
            }

        }
        else if(name == 2 ){
            if(num < 1000){
                System.out.println(alibaba.sale(product,num));
                alibaba.delivery(product, alibaba.speed);
            }else{
                System.out.println("У вас есть риск потерять деньги риск -" +alibaba.riskOfLoss + " вам лучше использовать " + amazon.name);
            }

        }else if(name == 3 ){
            if(num < 285){
                System.out.println(amazon.sale(product,num));
                amazon.delivery(product, amazon.speed);
            }else{
                System.out.println("У вас есть риск потерять деньги риск -" +amazon.riskOfLoss + "вы хотите продолжить ? да (1) нет (2)");
                int go = sc.nextInt();
                if(go == 1){
                    System.out.println(amazon.sale(product,num));
                    amazon.delivery(product, amazon.speed);
                }else if (go == 2){
                    System.out.println("до свидания!!!");

                }else {
                    System.out.println("ошибка");
                }
            }

        }










    }
}