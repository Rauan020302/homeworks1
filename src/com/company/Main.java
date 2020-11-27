package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person("Rauan","Ibragimov","Maksutovich", 2002,"to play Football", "Man");
	Person person2 = new Person("Sam","Goward","Black", 2002, "Man");
	Person person3 = new Person("Johnny","English",1969);
	Person person4 = new Person("Jack","Simon",1984);
	Person person5 = new Person("Harry","Potter",2000);
	Person person6 = new Person("Ron","Kruze",1978);
	Person person7 = new Person("Tom","Lennon",1980);
	Person person8 = new Person("Jerry","Hugan",1997);
	Person person9 = new Person("Holly","Berry",2005);
	Person person10 = new Person("Peter","Madison",2003);


        System.out.println(person1.name);
        System.out.println();
        System.out.println(person1);

        Person[] persons = {person1, person2,person3,person4,person5,person6,person7,person8,person9,person10};

        for(Person person : persons) {
            person.aboutMySelf();
        }



        // Ex. B

		//1. Что такое конструктор?
		//
		//> Конструктор это - с Person person1 = new Person();.
		//
		//2. Что такое дефолтный конструктор (по умолчанию)?
		//
		//> При создании объкта у нас создается дефолтный конст. но если мы собираемся создавать конст. сами, то необходимо создать дефолт. конст..
		//
		//3. Как работает конструктор?
		//
		//> конструктор работает вот так Public Person(задаем параметры){.
		//
		//4. Для чего нужен конструктор?
		//
		//> для более удобного написания переменных.
		//
		//5. Какой конструктор вызывается когда конструкторов несколько?
		//
		//> если конструкторов несколько то работает тот чьи переменные были заданы например: Person person1 = new Person(int a,String b);.
		//
		//6. Что такое this
		//
		//> this. дает понять системе что мы обращаемся к свойству объекта , а не  параметрам.























    }

}
