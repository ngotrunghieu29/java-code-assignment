package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoosterTest extends BaseTest {
    private final Rooster rooster = new Rooster();

    @Test
    public void roosterSing() {
        rooster.sing();
        Assertions.assertEquals("Cock-a-doodle-doo", outContent.toString().trim());
    }

    @Test
    public void roosterCanNotFly() {
        Assertions.assertFalse(rooster.canFly());
    }
}