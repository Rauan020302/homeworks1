package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       System.out.println("Courses");
        LocalDate date1 = LocalDate.of(2019, 12,2);
        Course course = new Course("Java",date1,"JAVA_01","Sabina Temirbekova");
     System.out.println(course);

        //Student
        System.out.println();
        System.out.println("Students");
        LocalDate date2 = LocalDate.of(2002,3,3);
        Student student = new Student(date2, "Adamson", "Sam", "Man", 23 );
     System.out.println(student);

        //Группа

        System.out.println();
        System.out.println("Groups");

        LocalDate date3 = LocalDate.of(2020,10,15);
        LocalDate date4 = LocalDate.of(2002,11,17);
        LocalDate date5 = LocalDate.of(2003,7,4);
        LocalDate date6 = LocalDate.of(2004,5,5);

        Student student4 = new Student(date4,"Bale","Neymar","male",18);
        Student student5 = new Student(date5,"Ronaldo","Hazard","male",17);
        Student student6 = new Student(date6,"Messi","Lewandovski","male",16);
        Student[] students1 = {student4,student5,student6};
        Course course1 = new Course("English",date1,"id Eng123","mr Rooney");

        Group groupA = new Group("GroupA ",students1,course1,date3,9);
     System.out.println(groupA);



        //Lessons
       System.out.println("Lessons");
        LocalDate date7 = LocalDate.of(2003,10,2);

        Student student1 = new Student(date2,"Batman","Bruce","male",18);
        Student student2 = new Student(date7,"Superman","Alfredd","male",17);
        Student student3 = new Student(date3,"Spiderman","Peter","male",16);

        Student[] students2 = new Student[3];
        students2[0] = student1;
        students2[1] = student2;
        students2[2] = student3;
        LocalDate date8 =  LocalDate.of(2010,10,5);
        LocalTime date9 = LocalTime.of(14,30);
        Course course2 = new Course("Java",date3,"JV - 142","Shamil");
        Lessons les1 = new Lessons(date8,students2,course2,date9,true,false);
        System.out.println(les1);






    }
}
