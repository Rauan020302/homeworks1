package com.company;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Map<Week,Integer> week = new LinkedHashMap<>();
        Week monday = new Week(1,"Monday");
        Week tuesday = new Week(2,"Tuesday");
        Week wednesday = new Week(3,"Wednesday");
        Week thursday = new Week(4,"Thursday");
        Week friday = new Week(5,"Friday");
        Week saturday = new Week(6,"Saturday");
        Week sunday = new Week(7,"Sunday");

           for (int i = 0; i < 100;i++) {
              int num = 1 + rand.nextInt(7);
              switch (num) {
                  case 1:
                      week.put(monday, num);
                      break;
                  case 2:
                      week.put(tuesday, num);
                      break;
                  case 3:
                      week.put(wednesday, num);
                      break;
                  case 4:
                      week.put(thursday, num);
                      break;
                  case 5:
                      week.put(friday, num);
                      break;
                  case 6:
                      week.put(saturday, num);
                      break;
                  case 7:
                      week.put(sunday, num);
                      break;
                  default:
//              if (num == 1){
//                  week.put(monday,num);
//              }else if (num == 2){
//                  week.put(tuesday,num);
//              }else if (num == 3){
//                  week.put(wednesday,num);
//              }else if (num == 4){
//                  week.put(thursday,num);
//              }else if (num == 5){
//                  week.put(friday,num);
//              }else if (num == 6){
//                  week.put(saturday,num);
//              }else if (num == 7){
//                  week.put(sunday,num);
//              }

              }

              System.out.println(week);


          }

    }
}
