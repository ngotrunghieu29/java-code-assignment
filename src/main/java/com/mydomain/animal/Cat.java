package com.mydomain.animal;

import com.mydomain.animal.behaviour.Singable;

public class Cat extends Animal implements Singable {

    @Override
    public void sing() {
        System.out.println("Meow");
    }
}
