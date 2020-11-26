package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ex.A
        //Dog
        System.out.println("age dogs = ");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        dog1.setAge(d1);
        dog2.setAge(d2);
        dog1.setColor("Black");
        dog2.setColor("Grey");
        dog1.setType("Ground");
        dog2.setType("Ground");

        System.out.println("The age of the dog1 is " + dog1.getAge());
        System.out.println("The color of the dog1 is " + dog1.getColor());
        System.out.println("The type of the dog1 is " + dog1.getType());

        System.out.println("The age of the dog2 is " + dog2.getAge());
        System.out.println("The color of the dog2 is " + dog2.getColor());
        System.out.println("The type of the dog2 is " + dog2.getType());

        //Cat
        System.out.println("age cats = ");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        cat1.setAge(c1);
        cat2.setAge(c2);
        cat1.setColor("White");
        cat2.setColor("blue");
        cat1.setType("Ground");
        cat2.setType("Ground");

        System.out.println("The age of the cat1 is " + cat1.getAge());
        System.out.println("The color of the cat1 is " + cat1.getColor());
        System.out.println("The type of the cat1 is " + cat1.getType());

        System.out.println("The age of the cat2 is " + cat2.getAge());
        System.out.println("The color of the cat2 is " + cat2.getColor());
        System.out.println("The type of the cat2 is " + cat2.getType());

        //Fish
        System.out.println("age fishes = ");
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        fish1.setAge(f1);
        fish2.setAge(f2);
        fish1.setColor("Red");
        fish2.setColor("Yellow");
        fish1.setType("Aquatic");
        fish2.setType("Aquatic");

        System.out.println("The age of the fish1 is " + fish1.getAge());
        System.out.println("The color of the fish1 is " + fish1.getColor());
        System.out.println("The type of the fish1 is " + fish1.getType());

        System.out.println("The age of the fish2 is " + fish2.getAge());
        System.out.println("The color of the fish2 is " + fish2.getColor());
        System.out.println("The type of the fish2 is " + fish2.getType());

        //Parrot

        System.out.println("age parrots");
        Parrot parrot1 = new Parrot();
        Parrot parrot2 = new Parrot();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        parrot1.setAge(p1);
        parrot2.setAge(p2);
        parrot1.setColor("Pink");
        parrot2.setColor("Green");
        parrot1.setType("Air");
        parrot2.setType("Air");

        System.out.println("The age of the parrot1 is " + parrot1.getAge());
        System.out.println("The color of the parrot1 is " + parrot1.getColor());
        System.out.println("The type of the parrot1 is " + parrot1.getType());

        System.out.println("The age of the parrot2 is " + parrot2.getAge());
        System.out.println("The color of the parrot2 is " + parrot2.getColor());
        System.out.println("The type of the parrot2 is " + parrot2.getType());



        //Ex.B

        //Course
        System.out.println();
        System.out.println("КУРС");
        LocalDate date1 = LocalDate.of(2019, 12,2);
        Course course = new Course("Java",date1,"JAVA_01","Sabina Temirbekova");
        System.out.println("название: " + course.getName());
        System.out.println("дата: " + course.getDate());
        System.out.println("ID: " + course.getId());
        System.out.println("Преподаватель: " + course.getFullName());

        //Student
        System.out.println();
        System.out.println("СТУДЕНТ");
        LocalDate date2 = LocalDate.of(2002, 03,02);
        Student student = new Student(date2, "Adamson", "Sam", "Man", 23 );
        System.out.println("Имя: " + student.getName());
        System.out.println("Дата рождения: " + student.getDate());
        System.out.println("Фамилия: " + student.getSurname());
        System.out.println("Пол: " + student.getGenner());
        System.out.println("Возраст: " + student.getAge());

        //Группа

        System.out.println();
        System.out.println("ГРУППА");
        LocalDate date3 = LocalDate.of(2020,10,15);
        Group groupA = new Group("ГРУППА-А",date3,9);
        Group groupB = new Group("ГРУППА-B",date3,12);

        Group[] Groups = new Group[2];
        Groups[0] = groupA;
        Groups[1] = groupB;

        Course2 course2 = new Course2( "Java",Groups,"Sam");
        System.out.println("Название: " + course2.getName());
        System.out.println("Студент: " + course2.getName2());
        for(int i = 0; i < course2.getGroups().length; i++){
            System.out.println(course2.getGroups()[i].getName());
        }
    }
}
