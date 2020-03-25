package com.mydomain.animal;

import com.mydomain.animal.behaviour.Singable;

public class Dog extends Animal implements Singable {

    @Override
    public void sing() {
        System.out.println("Woof, woof");
    }
}
