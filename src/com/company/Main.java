package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<String> songList = new ArrayList<>();


        songList.add("Ветер с моря дул");
        songList.add("Ветер с моря дул");
        songList.add("Нагонял беду");
        songList.add("Нагонял беду");
        songList.add("И сказал ты мне");
        songList.add("И сказал ты мне");
        songList.add("Больше не приду");
        songList.add("Больше не приду");
        //дальше не смог сделать

        //Ex.B *************************************************
        System.out.println("Random numbers");
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = 50;
        for(int i = 0;i < a; i++){
            arrayList.add(rand.nextInt((100-1)+1)+1);
        }
        System.out.println(arrayList);

        System.out.println("\ndivisible by 2");

        ArrayList<Integer> evenList = new ArrayList<>();
        for(int i = 0;i < arrayList.size();i++){
            int line = arrayList.get(i);
            if(line % 2 == 0){
                evenList.add(i);
            }

        }

        System.out.println(evenList);

        System.out.println("\ndivisible by 3");

        ArrayList<Integer> oddList = new ArrayList<>();
        for(int i = 0;i < arrayList.size();i++){
            int line = arrayList.get(i);
            if(line % 3 == 0){
                oddList.add(i);
            }
        }
        System.out.println(oddList);


    }
}



//1. Как вы понимаете массивы?
//   Ячейка в памяти
//2. Как вы понимаете ArrayList?
//   более совершенствованная версия массива
//3. В чем отличия между обычным массивом и ArrayList?
//   в том что ArrayList не даются размер массива, легче работать
//4. Как вы понимаете Wrapper классы и для чего они нужны?
//   они нужны для того чтобы ArrayList работал с примитивными данными
//5. Чем отличаются методы set(a, b) и add(a, b) у ArrayList?
//   set переопределяет массив, а add просто увеличивает место  
