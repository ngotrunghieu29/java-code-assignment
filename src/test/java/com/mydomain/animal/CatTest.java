package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest extends BaseTest {
    private final Cat cat = new Cat();

    @Test
    public void catSing() {
        cat.sing();
        Assertions.assertEquals("Meow", outContent.toString().trim());
    }
}