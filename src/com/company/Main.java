package com.company;

public class Main {

    public static void main(String[] args) {
        City city1 = new City("Maradona","Napoli");
        City city2 = new City("Ronaldo","Madrid");
        City city3 = new City("Messi","Barcelona");
        City[] cities = {city1,city2,city3};

        District district = new District("Obama","USA",cities);

        Village village1 = new Village("Bruce","Spain");
        Village village2 = new Village("Logan","Canada");

        city1.search("Maradona");
        city2.search("Ronaldo");
        city3.search("Messi");

        district.search("Obama");

        village1.search("Bruce");
        village2.search("Logan");



//HW23.B

//       1. Что такое модификатор abstract и зачем он нам?

//       модификатор abstract это одним словом обобщение,если это класс он нужен нам для того, чтобы мы не могли создавать объекты

//       2. К каким элементам можно применять abstract?

//       к методам и классам

//       3. Объясните применение abstract для методов.

//        если метод abstract то мы его уже не можем заполнять, но наследники обязаны его заполнять по своему

//       4. Приведите примеры реального мира, которые теоретически следовало бы создать abstract в мире ООП.

//        растения, мебель, транспорт, техника, и т.д

//       5. Объясните применение abstract для классов.

//        abstract класс применяется для того чтобы мы не могли создавать объекты этого класса


    }
}
