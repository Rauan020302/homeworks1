package com.company;

public class Bread implements Bakeable {
    @Override
    public void bake() {
        System.out.println("Bread is baking!!!");
    }
}
