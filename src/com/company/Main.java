package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Game game1 = new Game(rand.nextInt(15),rand.nextInt(15),rand.nextInt(15));
        Game game2 = new Game(rand.nextInt(15),rand.nextInt(15),rand.nextInt(15));
        Thread Real = new Thread(new Team("Real Madrid",game1));
        Thread Bayern = new Thread(new Team("Bayern",game2));

        Real.start();
        Bayern.start();

        //1. Разница между потоком и процессом?
        //   поток это как бы способ выполнения процесса
        //2. Какие есть состояния потока?
        //   New Runnable Running Dead
        //3. Зачем isAlive()?
        //   Выесняет используется поток или нет
        //4. Зачем join()?
        //   пока один поток не закончится другой не начнется
        //5. Что будет если вызвать new MyThread().run() напрямую без вызова start()?
        //   Тогда этот поток не сработает а сработает основной поток
        //6. Можно ли запустить один поток дважды?
        //   нет нельзя
        //7. Что такое блок синхронизации?
        //   блок синхронизации позволяет не привозить два или более потока к одному объекту
    }
}
