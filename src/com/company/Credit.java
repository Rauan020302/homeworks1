package com.company;

public class Credit {
    private String id;
    private int sum;
    private String period;
    private double percent;
    private static int numOfCalls;
    private static double sumOfCalls;

    public Credit(String id, int sum, String period, double percent) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.percent = percent;
        numOfCalls++;
        sumOfCalls = sumOfCalls + sum;
    }

    public static double getMid(){
        return sumOfCalls/numOfCalls;
    }

    public static double getSumOfCalls(){
        return sumOfCalls;
    }

    public static int getNumOfCalls(){
        return numOfCalls;
    }

}
