package com.mydomain.animal.insect;

import com.mydomain.animal.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ButterflyTest extends BaseTest {
    @Test
    public void caterpillarCanNotFly() {
        Butterfly butterfly = new Butterfly();
        Assertions.assertFalse(butterfly.canFly());
    }

    @Test
    public void caterpillarCanWalk() {
        Butterfly butterfly = new Butterfly();
        Assertions.assertTrue(butterfly.canWalk());
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
}