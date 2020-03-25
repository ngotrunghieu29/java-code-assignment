package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuckTest extends BaseTest {
    private Duck duck = new Duck();

    @Test
    public void duckSing() {
        duck.sing();
        Assertions.assertEquals("Quack, quack", outContent.toString().trim());
    }

    public void duckSwim() {
        duck.swim();
        Assertions.assertEquals("I am swimming", outContent.toString().trim());
    }
}