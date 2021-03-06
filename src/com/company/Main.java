package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer,Integer> week = new LinkedHashMap<>();
        Week week1 = new Week("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");


        for (int i = 0; i < 100;i++){
            int a = rand.nextInt(7-1+1)+1;
            int count = week.getOrDefault(a,0);
            week.put(a,++count);
        }
        System.out.println(week);

    }
}
