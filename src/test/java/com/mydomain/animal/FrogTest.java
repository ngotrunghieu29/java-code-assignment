package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogTest extends BaseTest {
    private final Frog frog = new Frog();

    @Test
    public void frogCanWalk() {
        Assertions.assertTrue(frog.canWalk());
    }

    @Test
    public void frogWalk() {
        frog.walk();
        Assertions.assertEquals("I am walking", outContent.toString().trim());
    }

    @Test
    public void frogCanSwim() {
        Assertions.assertTrue(frog.canSwim());
    }

    @Test
    public void frogSwim() {
        frog.swim();
        Assertions.assertEquals("I am swimming", outContent.toString().trim());
    }
}