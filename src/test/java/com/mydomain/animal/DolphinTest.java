package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DolphinTest extends BaseTest {
    private final Dolphin dolphin = new Dolphin();

    @Test
    public void dolphinCouldSwim() {
        dolphin.swim();
        Assertions.assertEquals("I am swimming", outContent.toString().trim());
    }

}