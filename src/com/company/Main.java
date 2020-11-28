package com.company;

public class Main {

    public static void main(String[] args) {


        Farm farm1 = new Farm("England", 5, 3, 2, "Mr Jack");
        farm1.printInfo();
        Cow cow1 = new Cow(70, 5, "Female", "Daisy");
        Cow cow2 = new Cow(85, 6, "male", "Sam");
        Cow cow3 = new Cow(60, 4, "male", "Miles");
        Cow cow4 = new Cow(40, 2, "female", "Bessy");
        Cow cow5 = new Cow(65, 4, "male", "Eddy");

        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        for (Cow cow : cows) {
            cow.printInfo();
        }


        Sheep sheep1 = new Sheep(30, 4, "male", "Kean");
        Sheep sheep2 = new Sheep(40, 5, "female", "Robby");
        Sheep sheep3 = new Sheep(50, 6, "male", "Robben");

        Sheep[] sheeps = {sheep1, sheep2, sheep3};
        for (Sheep sheep : sheeps) {
            sheep.printInfo();
        }
        Horse horse1 = new Horse(70, 5, "Black", "female", "Diana");
        Horse horse2 = new Horse(60, 4, "white", "male", "August");

        Horse[] horses = {horse1,horse2};
        for(Horse horse : horses){
            horse.printInfo();
        }

        Farm farm2 = new Farm("Finland", 1, 1, 1, "Mr Black");
        farm2.printInfo();
        Cow cow6 = new Cow(55,3,"male","Vally");
            cow6.printInfo();


        Sheep sheep4 = new Sheep(45,5,"female","Dolly");
            sheep4.printInfo();


        Horse horse3 = new Horse(80,10,"Grey", "male", "Nicolas");
            horse3.printInfo();


   }
}
