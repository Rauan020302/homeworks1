package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1. Почему класс List<Object> не является родителем класса List<String>?
        //   Универсальные типы не являются полиморфными полиморфизм применяяется только к типам коллекций
        //2. Для чего нужны wildcards?
        //   помогает делать List<Object> родителем класса List<String> след образом List<? extends Object> list = new ArrayList<String>();

        List<Double> list = new ArrayList<>();
        list.add(12.0);
        list.add(13.0);
        list.add(15.0);
        list.add(10.0);
        MethodSum<Double> methodSum = new MethodSum<>(list);
        double total = 0;
        methodSum.sum(list,total);



        Double[] arrs = {10.0,15.0,12.0,25.0,30.0};
        MethodAverage<Double> methodAverage = new MethodAverage<>(arrs);
        double sum = 0;
        methodAverage.average(arrs,sum);


    }
}
