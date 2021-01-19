package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Ex A

        ArrayList<Cat> cats1 = new ArrayList<>();
        long before = System.currentTimeMillis();
        for(int i = 0;i < 1000000;i++) {
            cats1.add(new Cat("Cat", i));
            if(i > 500000 && i <500100 ){
                cats1.add(new Cat("Cat",i));

            }
        }
        long after = System.currentTimeMillis();
        long total = after - before;
        System.out.println(total);
        long before2 = System.currentTimeMillis();
        for(int i = 0;i < 1000000;i++) {
            cats1.add(new Cat("Cat", i));
            if(i < 100){
                cats1.add(new Cat("Cat",i));
            }
        }
        long after2 = System.currentTimeMillis();
        long total2 = after2 - before2;
        System.out.println(total2);

        long before3 = System.currentTimeMillis();
        for(int i = 0;i < 1000000;i++) {
            cats1.add(new Cat("Cat", i));
            if(i > 999900){
                cats1.add(new Cat("Cat",i));
            }
        }
        long after3 = System.currentTimeMillis();
        long total3 = after3- before3;
        System.out.println(total3);

        long before4 = System.currentTimeMillis();
        cats1.get(500000);
        long after4 = System.currentTimeMillis();
        long total4 = after4 - before4;
        System.out.println(total4);

        long before5 = System.currentTimeMillis();
        cats1.get(1000000);
        long after5 = System.currentTimeMillis();
        long total5 = after5 - before5;
        System.out.println(total5);

        long before6 = System.currentTimeMillis();
        cats1.remove(500000);
        long after6 = System.currentTimeMillis();
        long total6 = after6 - before6;
        System.out.println(total6);

        long before7 = System.currentTimeMillis();
        cats1.remove(1000000);
        long after7 = System.currentTimeMillis();
        long total7 = after7 - before7;
        System.out.println(total7);

        long totalAll = total +total2 + total3 + total4 + total5 + total6 +total7;

        System.out.println("Общее количество милисекунд для ArrayList - " + totalAll);

        LinkedList<Cat> cats2 = new LinkedList<>();
        long before11 = System.currentTimeMillis();
        for(int i = 0;i < 1000000;i++) {
            cats2.add(new Cat("Cat", i));
            if(i > 500000 && i <500100 ){
                cats2.add(new Cat("Cat",i));

            }
        }
        long after11 = System.currentTimeMillis();
        long total11 = after11 - before11;
        System.out.println(total11);
        long before22 = System.currentTimeMillis();
        for(int i = 0;i < 1000000;i++) {
            cats2.add(new Cat("Cat", i));
            if(i < 100){
                cats2.add(new Cat("Cat",i));
            }
        }
        long after22 = System.currentTimeMillis();
        long total22 = after22 - before22;
        System.out.println(total22);

        long before33 = System.currentTimeMillis();
        for(int i = 0;i < 1000000;i++) {
            cats2.add(new Cat("Cat", i));
            if(i > 999900){
                cats2.add(new Cat("Cat",i));
            }
        }
        long after33 = System.currentTimeMillis();
        long total33 = after33 - before33;
        System.out.println(total33);

        long before44 = System.currentTimeMillis();
        cats2.get(500000);
        long after44 = System.currentTimeMillis();
        long total44 = after44 - before44;
        System.out.println(total44);

        long before55 = System.currentTimeMillis();
        cats2.getLast();
        long after55 = System.currentTimeMillis();
        long total55 = after55 - before55;
        System.out.println(total55);

        long before66 = System.currentTimeMillis();
        cats2.remove(500000);
        long after66 = System.currentTimeMillis();
        long total66 = after66 - before66;
        System.out.println(total66);

        long before77 = System.currentTimeMillis();
        cats2.remove(1000000);
        long after77 = System.currentTimeMillis();
        long total77 = after77 - before77;
        System.out.println(total77);

        long totalAll2 = total11 +total22 + total33 + total44 + total55 + total66 +total77;

        System.out.println("Общее количество милисекунд для LinkedList - " + totalAll2);

        System.out.println("разница - " + (totalAll2 - totalAll));











        //Ex B

        List<Animal> animalList = new LinkedList<>();

        //Создание кошек и собак
        for(int i = 1;i <= 50;i++){
            animalList.add(new Cat("Cat",i));
            animalList.add(new Dog("Dog",i));

        }
        System.out.println("Создание кошек и собак");
        System.out.println(animalList);


        //Удаление кошек и добавление мышек
        int catCount = 0;
        int dogCount = 0;
        for(int i = 0; i < animalList.size();i++){
            if(animalList.get(i) instanceof Cat){
                catCount++;
                if(catCount % 5 == 0){
                    animalList.remove(i);
                    i--;
                }
            }if (animalList.get(i) instanceof Dog){
                dogCount++;
                if (dogCount % 3 == 0){
                    animalList.set(i+1,new Mouse("Mouse",i));
                    i--;
                }
            }
        }
        System.out.println("Удаление кошек и добавление мышек");
        System.out.println(animalList);

        List<Animal> newAnimalList = new LinkedList<>();

        //Перемещение кошек и мышек
        for(int i = 0; i < animalList.size()-1;i++){
            if(animalList.get(i+1) instanceof Cat && animalList.get(i) instanceof Mouse){
                newAnimalList.add(new Cat("Cat",i));
                newAnimalList.add(new Mouse("Mouse",i));

            }
        }
        System.out.println("Перемещение кошек и мышек");
        System.out.println(newAnimalList);



















        //1. Что вам непонятно в массивах?
        //   вроде ничего
        //2. Какие минусы есть у ArrayList?
        //   сложно добавить в середину списка, размер массива задает сам из за этого есть некие проблемы
        //3. Объясните структуру LinkedList?
        //   быстро дабавляет в начало и в конец очередь с двумя одним концом
        //4. В чем отличие между ArrayList и LinkedList?
        //   LinkedList под капотом не имеет массива каждый элемент имеет ссылку только на след и пред элемент
        //5. Какие плюсы и минусы есть при работе с LinkedList?
        //   быстрое добавление в конец листа есть свои уникальные методы


	    }
}
