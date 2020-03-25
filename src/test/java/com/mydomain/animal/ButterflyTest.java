package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ButterflyTest extends BaseTest {
    private final Butterfly butterfly = new Butterfly();

    @Test
    public void butterflyCouldFly() {
        butterfly.fly();
        Assertions.assertEquals("I am flying", outContent.toString().trim());
    }
}