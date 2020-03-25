package com.mydomain.animal;

import com.mydomain.animal.behaviour.EatOtherFish;
import com.mydomain.animal.characteristic.Color;
import com.mydomain.animal.characteristic.Size;

public class Shark extends Fish implements EatOtherFish {
    public Shark() {
        this.color = Color.GRAY;
        this.size = Size.LARGE;
    }
}
