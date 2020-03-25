package com.mydomain.animal;

public class Chicken extends Bird {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        // do nothing
    }
}
