package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Dog> dalmatinec = new HashSet<>();

        for(int i = 0; i < 40;i++){
            dalmatinec.add(new Dog("dalmatinec" + i,i));
        }

        for (Iterator<Dog> it = dalmatinec.iterator(); it.hasNext();){
            Dog s = it.next();
            if (s.equals(s));

        }
        System.out.println(dalmatinec);






    }




    //1. Как вы понимаете hashCode?
    //   уникальный номер для каждого объекта
    //2. Для чего мы можем переписать метод генерирования hashCode?
    //   при переопределении equals мы должны переопределить hashCode
    //3. Как работает HashSet?
    //   это множество которое хранит в себе в произвольном положении объекты но находит их очень быстро
    //4. Какие отличия есть у HashSet & ArrayList?
    //   у HashSet нет метода get
    //5. Как вы думаете, как мы можем избавиться от дубликатов в ArrayList при помощи HashSet?
    //


}
