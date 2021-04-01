package com.company;

import java.util.List;

public class MethodSum<T> {
    private List<T> list;

    public MethodSum(List<T> list) {
        this.list = list;
    }

    public <T extends Number> void  sum(List<T> list, double total){
        for (T t : list) {
            total += (double) t;
        }
        System.out.println(total);



    }


}
//Создать методы, которые позволяют:
//
//· Суммировать
//
//· Находить среднеарифметическое
//
//Для любых коллекций и массивов чисел (Integer, Float, Double)
//
//Подсказка, использовать класс Number.
//
//· Один метод (суммирование) реализовать для коллекций с wildcard
//
//· Второй (среднеарифм) с помощью массивов – generic methods
