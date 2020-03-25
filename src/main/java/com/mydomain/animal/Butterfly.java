package com.mydomain.animal;

import com.mydomain.animal.behaviour.Flyable;

public class Butterfly extends Animal implements Flyable {
    @Override
    public void walk() {
        // do nothing
    }
}
