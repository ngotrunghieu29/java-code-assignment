package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChickenTest extends BaseTest {
    private final Chicken chicken = new Chicken();

    @Test
    public void chickenSing() {
        chicken.sing();
        Assertions.assertEquals("Cluck, cluck", outContent.toString().trim());
    }

    @Test
    public void chickenCanNotFly() {
        Assertions.assertFalse(chicken.canFly());
    }
}