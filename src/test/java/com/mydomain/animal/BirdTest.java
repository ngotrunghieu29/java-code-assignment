package com.mydomain.animal;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BirdTest {
    private final Bird bird = new Bird();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

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