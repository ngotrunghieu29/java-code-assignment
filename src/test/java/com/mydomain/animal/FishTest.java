package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FishTest extends BaseTest {
    private final Fish fish = new Fish();

    @Test
    public void fishSwim() {
        fish.swim();
        Assertions.assertEquals("I am swimming", outContent.toString().trim());
    }

    @Test
    public void fishCanNotWalk() {
        Assertions.assertFalse(fish.canWalk());
    }

}