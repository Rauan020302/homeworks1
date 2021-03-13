package com.company;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Запускаем игру");
        JFrame window = new JFrame("Крестики-нолики");//главное окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//закрытие окна
        window.setSize(400,400);//размер окна
        window.setLayout(new BorderLayout());//менеджер компоновки
        window.setLocationRelativeTo(null);//чтобы окно было по центру экрана
        window.setVisible(true);//включаем видимость окна
        TicTacToe game = new TicTacToe();//создаем объект нашего класса
        window.add(game);
        System.out.println("конец...");
    }
}
