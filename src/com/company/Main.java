package com.company;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,Car> cars = new HashMap<>();
        Car BMW = CarDB.getCarById(1);
        cars.put("A2002A",BMW);
        Car RollsRoyce = CarDB.getCarById(2);
        cars.put("B2003B",RollsRoyce);
        Car Toyota = CarDB.getCarById(3);
        cars.put("C2004C",Toyota);
        System.out.println(cars);




        //1. Что такое ключ в HashMap?
        // что то вроде клички
        //2. Что такое значение в HashMap?
        // значение это и есть сам объект
        //3. Основная логика HashMap?
        // хранить данные ввиде ключ-значение
        //4. Уникальны ли ключи в HashMap? Почему?
        // да уникальны потому что это как ID с помощью него мы находим значения
        //5. Уникальны ли значения в HashMap? Почему?
        // нет потому что могут быть множество одинаковых значений
        //6. Как пройтись по всем значениям?
        // с помощью циклов и методов
        //7. Как получить значение по ключу?
        // с помощью методов get
    }
}
