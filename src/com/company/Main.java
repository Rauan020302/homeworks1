package com.company;


public class Main {

    public static void main(String[] args) {
        Koala koala = new Koala();
        Monkey monkey = new Monkey(koala);

        monkey.climb();
        monkey.koala.climb();

        monkey.eat();
        koala.eat();


                //1. Что такое интерфейс?
                //это конструкция в которой описывают методы или константы с помощью интерфейса можно указать что именно должен выполнять класс наследник
                //2. В чем преимущество использования интерфейсов?
                //множественная наследование и легкая зависимость
                //3. Как работают свойства в интерфейсах?
                //как константы
                //4. Может ли один интерфейс унаследовать другой? Каким образом
                //с помощью extends
                //5. Что такое композиция?
                //это когда имеет свойство а не наследуется
                //6. Что такое наследование?
                //это когда все что имеет родитель передается наследнику
                //7. В чем отличие между наследованием и композицией?
                //в композиции мы переиспользуем код а в наследовании расширяем,в композиции мы можем использовать код даже из final класса а в насл нет
         }


}
