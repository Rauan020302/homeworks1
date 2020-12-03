package com.company;

public class Main {

    public static void main(String[] args) {



        Cow cow1 = new Cow(70, 5, "Female", "Daisy");
        Cow cow2 = new Cow(85, 6, "male", "Sam");
        Cow cow3 = new Cow(60, 4, "male", "Miles");
        Cow cow4 = new Cow(40, 2, "female", "Bessy");
        Cow cow5 = new Cow(65, 4, "male", "Eddy");

        Sheep sheep1 = new Sheep(30, 4, "male", "Kean");
        Sheep sheep2 = new Sheep(40, 5, "female", "Robby");
        Sheep sheep3 = new Sheep(50, 6, "male", "Robben");

        Horse horse1 = new Horse(70, 5, "Black", "female", "Diana");
        Horse horse2 = new Horse(60, 4, "white", "male", "August");


        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};


        Sheep[] sheeps = {sheep1, sheep2, sheep3};


        Horse[] horses = {horse1,horse2};


        Farm farm1 = new Farm("England",cows , sheeps,  horses, "Mr Jack");
        System.out.println(farm1);



        Cow cow6 = new Cow(55,3,"male","Vally");

        Sheep sheep4 = new Sheep(45,5,"female","Dolly");

        Horse horse3 = new Horse(80,10,"Grey", "male", "Nicolas");

        Cow[] cows1 = {cow6};
        Sheep[] sheeps1 = {sheep4};
        Horse[] horses1 = {horse3};


        System.out.println();
        Farm farm2 = new Farm("Finland", cows1 ,sheeps1 , horses1, "Mr Black");
        System.out.println(farm2);

   }
}
