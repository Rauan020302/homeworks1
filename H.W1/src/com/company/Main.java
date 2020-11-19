package com.company;

public class Main {

    public static void main(String[] args) {
        // EX. A
        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();
        System.out.println("EX. A");
        studentOne.name = "Sam";
        studentOne.age = 19;
        studentOne.level = 4; // курс
        studentOne.typeOfTraining = "Programming"; // направление обучения
        System.out.println("name:" + studentOne.name + " age:" + studentOne.age + " level:" + studentOne.level + " type of training:" + studentOne.typeOfTraining );

        studentTwo.name = "Tom";
        studentTwo.age = 18;
        studentTwo.level = 2;
        studentTwo.typeOfTraining = "Architect";
        System.out.println("name:" + studentTwo.name + " age:" + studentTwo.age + " level:" + studentTwo.level + " type of training:" + studentTwo.typeOfTraining );

        studentOne.name = "John";
        studentOne.age = 21;
        studentOne.level = 5;
        studentOne.typeOfTraining = "Businessman";
        System.out.println("name:" + studentOne.name + " age:" + studentOne.age + " level:" + studentOne.level + " type of training:" + studentOne.typeOfTraining );

        System.out.println("EX. B");

        //EX.B

        Club clubOne = new Club();//футбольный клуб
        Club clubTwo = new Club();
        Club clubThree = new Club();
        clubOne.name = "Bayern"; //название команды
        clubOne.budget = 24530000.325; //бюджет
        clubOne.numOfPlayers = 24; //количество игроков
        clubOne.coach = "Flick"; //тренер
        System.out.println("Name:" + clubOne.name + " budget:" + clubOne.budget + " number of players:" + clubOne.numOfPlayers + " coach:" + clubOne.coach);

        clubOne.name = "Barcelona";
        clubOne.budget = 22400000.4324;
        clubOne.numOfPlayers = 20;
        clubOne.coach = "Koeman";
        System.out.println("Name:" + clubOne.name + " budget:" + clubOne.budget + " number of players:" + clubOne.numOfPlayers + " coach:" + clubOne.coach);

        clubOne.name = "Real Madrid";
        clubOne.budget = 23650000.123;
        clubOne.numOfPlayers = 22;
        clubOne.coach = "Zidane";
        System.out.println("Name:" + clubOne.name + " budget:" + clubOne.budget + " number of players:" + clubOne.numOfPlayers + " coach:" + clubOne.coach);

        //EX. C

        //· 1. Что такое парадигма ООП?

        //Наследование, Инкапсуляция, Полиморфизм.

        //· 2. Что такое классы в Java?

        //Шаблон,чертеж или эскиз это класс Н: машина, дом, дерево

        //· 3. Что такое свойства класса?

        //это описание того же класса Н: высота дома, стоимость машины и т.д

        //· 4. Как создать экземпляр класса (объект)?

        //public class Person{

        //· 5. Как создать свойства для определенного класса?


        //String name;
        //int age;

        //· 6. Как задать свойства?

        //personOne.name = "Sam";
        //personOne.age = 14;

        //· 7. Как получить определенное свойства объекта?

        //person.name
        //person.age







    }
}
