package com.company;
import com.company.person.Person;
import com.company.group.Course;
import com.company.group.Group;
import com.company.group.Lessons;
import com.company.person.Student;
import com.company.person.Teacher;

import java.time.LocalDate;
import java.time.LocalTime;

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
        Student student = new Student(date2, "Adamson", "Sam", "Man", 23 ,400);
        System.out.println(student);

        //Группа

        System.out.println();
        System.out.println("Groups");

        LocalDate date10 = LocalDate.of(1970,6,1);
        Teacher teach = new Teacher(date10,"Maradona","Messi","male",60,"Football");

        LocalDate date3 = LocalDate.of(2020,10,15);
        LocalDate date4 = LocalDate.of(2002,11,17);
        LocalDate date5 = LocalDate.of(2003,7,4);
        LocalDate date6 = LocalDate.of(2004,5,5);

        Student student4 = new Student(date4,"Bale","Neymar","male",18,100);
        Student student5 = new Student(date5,"Ronaldo","Hazard","male",17,200);
        Student student6 = new Student(date6,"Messi","Lewandovski","male",16,300);
        Student[] students1 = {student4,student5,student6};

        Course course1 = new Course("English",date1,"id Eng123","mr Rooney");


        Group groupA = new Group("GroupA ",teach,students1,course1,date3,9);
        System.out.println(groupA);
        System.out.println();



        //Lessons
        System.out.println("Lessons");
        LocalDate date7 = LocalDate.of(2003,10,2);
        LocalDate date11 = LocalDate.of(1875,5,24);
        Teacher teach2 = new Teacher(date11,"Alex","Morgan","famale",40,"English");

        Student student1 = new Student(date2,"Batman","Bruce","male",18,500);
        Student student2 = new Student(date7,"Superman","Alfredd","male",17,600);
        Student student3 = new Student(date3,"Spiderman","Peter","male",16,700);

        Student[] students2 = new Student[3];
        students2[0] = student1;
        students2[1] = student2;
        students2[2] = student3;
        LocalDate date8 =  LocalDate.of(2010,10,5);
        LocalTime date9 = LocalTime.of(14,30);
        Course course2 = new Course("Java",date3,"JV - 142","Shamil");
        Lessons les1 = new Lessons(date8,teach2, students2,course2,date9,true,false);
        System.out.println(les1);




        ////////
        //Ex19.B
        ////////

        //1. Что такое модификаторы доступа и зачем они нужны?
        //   модификаторы доступа это некие элементы которые дают свойствам или методам уровни доступности.
        //2. Какие бывают модификаторы доступа?
        //   public, defaut, private, protected.
        //3. Что такое package, для чего они нужны?
        //   это самая обычная папка для удобного хранения данных для распределения данных по полочкам.
        //4. В чем отличие между default и public?
        //   если использовать default то можно будет обращаться к данным(свойстам или методам) только в пределах заданной папки,
        //   а если public то везде.
        //5. Зачем делать сеттер private а геттер public, что это нам даст?
        //   Для того чтобы можно было выводить данные на консоль но нельзя было задавать.





    }
}
