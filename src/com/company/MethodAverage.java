package com.company;

public class MethodAverage<T> {
    private T[] arr;

    public MethodAverage(T[] arr) {
        this.arr = arr;
    }

    public void average(T[] arr, double sum){
        for (T t : arr) {
            sum += (double) t;

        }
        double average = sum / arr.length;
        System.out.println(average);

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
