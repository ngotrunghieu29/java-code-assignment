package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DogTest extends BaseTest {
    private final Dog dog = new Dog();

    @Test
    public void dogSing() {
        dog.sing();
        Assertions.assertEquals("Woof, woof", outContent.toString().trim());
    }
}