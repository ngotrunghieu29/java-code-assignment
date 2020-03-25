package com.mydomain.animal;

import com.mydomain.animal.behaviour.Swimmable;

public class Fish extends Animal implements Swimmable {
    @Override
    public void walk() {
        // do nothing
    }
}
