package com.mydomain.animal;

import com.mydomain.animal.behaviour.Swimmable;

public class Dolphin extends Animal implements Swimmable {
    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public void walk() {
        // do nothing
    }
}
