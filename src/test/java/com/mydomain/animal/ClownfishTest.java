package com.mydomain.animal;

import com.mydomain.animal.characteristic.Color;
import com.mydomain.animal.characteristic.Size;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClownfishTest extends BaseTest {
    private final Clownfish clownfish = new Clownfish();

    @Test
    public void clownfishAreSmall() {
        Assertions.assertEquals(Size.SMALL, clownfish.size);
    }

    @Test
    public void clownfishAreColourful() {
        Assertions.assertEquals(Color.COLOURFUL, clownfish.color);
    }

    @Test
    public void clownfishMakeJokes() {
        clownfish.makeJoke();
        Assertions.assertEquals("I am making jokes", outContent.toString().trim());
    }

    @Test
    public void clownfishCouldSwim() {
        clownfish.swim();
        Assertions.assertEquals("I am swimming", outContent.toString().trim());
    }
}