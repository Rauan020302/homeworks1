package com.company;

import javax.swing.*;
import java.awt.*;

public class Parabola extends Canvas {
    public static final int A = 800;
    public static final int B = 800;

    public Parabola(){}

    @Override
    public void paint(Graphics graphics) {
        //x = y*y
        graphics.drawLine(300,300,325,275);
        graphics.drawLine(300,300,275,275);

        graphics.drawLine(325,275,350,100);
        graphics.drawLine(275,275,250,100);

        graphics.drawLine(350,100,375,0);
        graphics.drawLine(250,100,225,0);

        //x = y*y*y

        graphics.drawLine(0,300,800,300);
        graphics.drawLine(300,0,300,800);
        graphics.drawLine(400,0,400,800);

        graphics.drawLine(400,300,425,275);
        graphics.drawLine(425,275,450,100);
        graphics.drawLine(450,100,475,0);

        graphics.drawLine(400,300,375,325);
        graphics.drawLine(375,325,350,500);
        graphics.drawLine(350,500,325,600);


        }

    public static void main(String[] args) {
        Parabola canvas = new Parabola();
        JFrame frame = new JFrame();
        frame.setSize(A,B);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);

    }

}
