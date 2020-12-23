package com.company;

public class Main {

    public static void main(String[] args) {

        Bread bread1 = new Bread();
        Bakeable bread2 = new Bread();

        Circle circle1 = new Circle();
        Drawable circle2 = new Circle();

        bread1.bake();
        bread2.bake();

        circle1.draw();
        circle2.draw();





        //1.Что такое interface?

        //*   интерфейс это почти тоже самое что и абстракт класс только интерфейс можно многожественное наследование

        //2.В чем отличие interface от обычного класса?

        //*   интерфейс: нельзя создавать объект есть многожественное наследование

        //3.Объясните применение interface.

        //*   вместо класса пишется interface желательно писать окончанием -able

        //4.Отличие interface от abstract класса?

        //*   множественное наследование

        //5.Что такое ссылка?

        //*   это адрес ячейки в памяти, хранящий данные

        //6.Как можно использовать ссылку типа родительского класса для других объектов типа наследник?

        //*   Bakeable bread = new Bread(); это дает нам возможность создавать массивы
    }
}
