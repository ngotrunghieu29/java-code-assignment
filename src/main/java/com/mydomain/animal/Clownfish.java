package com.mydomain.animal;

import com.mydomain.animal.behaviour.MakeJokeable;
import com.mydomain.animal.characteristic.Color;
import com.mydomain.animal.characteristic.Size;

public class Clownfish extends Fish implements MakeJokeable {
    public Clownfish() {
        this.color = Color.COLOURFUL;
        this.size = Size.SMALL;
    }
}
