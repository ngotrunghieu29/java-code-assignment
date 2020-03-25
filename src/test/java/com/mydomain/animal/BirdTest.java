package com.mydomain.animal;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BirdTest extends BaseTest {
    private final Bird bird = new Bird();

    @Test
    public void birdWalk() {
        bird.walk();
        Assertions.assertEquals("I am walking", outContent.toString().trim());
    }

    @Test
    public void birdFly() {
        bird.fly();
        Assertions.assertEquals("I am flying", outContent.toString().trim());
    }

    @Test
    public void birdSing() {
        bird.sing();
        Assertions.assertEquals("I am singing", outContent.toString().trim());
    }
}