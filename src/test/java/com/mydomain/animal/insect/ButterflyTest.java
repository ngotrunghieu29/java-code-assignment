package com.mydomain.animal.insect;

import com.mydomain.animal.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ButterflyTest extends BaseTest {
    @Test
    public void caterpillarCanNotFly() {
        Butterfly caterpillar = new Butterfly();
        Assertions.assertFalse(caterpillar.canFly());
    }

    @Test
    public void caterpillarCanWalk() {
        Butterfly caterpillar = new Butterfly();
        Assertions.assertTrue(caterpillar.canWalk());
    }

    @Test
    public void butterflyCanFly() {
        Butterfly butterfly = new Butterfly();
        butterfly.becomeButterfly();
        Assertions.assertTrue(butterfly.canFly());
    }

    @Test
    public void butterflyCanNotWalk() {
        Butterfly butterfly = new Butterfly();
        butterfly.becomeButterfly();
        Assertions.assertFalse(butterfly.canWalk());
    }

    @Test
    public void butterFlyAsButterfly() {
        Butterfly butterfly = new Butterfly();
        butterfly.becomeButterfly();
        butterfly.fly();
        Assertions.assertEquals("I am flying", outContent.toString().trim());
    }

    @Test
    public void caterpillarWalk() {
        Butterfly caterpillar = new Butterfly();
        caterpillar.walk();
        Assertions.assertEquals("I am walking", outContent.toString().trim());
    }
}