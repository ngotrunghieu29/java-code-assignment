package com.mydomain.animal;

import com.mydomain.animal.behaviour.Swimmable;
import com.mydomain.animal.characteristic.Color;
import com.mydomain.animal.characteristic.Size;

public class Fish extends Animal implements Swimmable {
    protected Size size;
    protected Color color;

    @Override
    public void walk() {
        // do nothing
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}
