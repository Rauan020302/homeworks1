package com.company;

public class SomeThread implements Runnable{
    private static int num = 10;
    private int a;

    public SomeThread(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        if (a == 1 ){
            num = num * 2;
            System.out.println(num);
        }else if (a == 2){
            num = num / 2;
            System.out.println(num);
        }else if (a == 3){
            num = num + 2;
            System.out.println(num);
        }else{
            num = num - 2;
            System.out.println(num);
        }
    }
}
