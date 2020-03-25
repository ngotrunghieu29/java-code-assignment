package com.mydomain.animal;

import com.mydomain.animal.characteristic.Color;
import com.mydomain.animal.characteristic.Size;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SharkTest extends BaseTest {
    private final Shark shark = new Shark();

    @Test
    public void sharksAreLarge() {
        Assertions.assertEquals(Size.LARGE, shark.size);
    }

    @Test
    public void sharkAreGray() {
        Assertions.assertEquals(Color.GRAY, shark.color);
    }

    @Test
    public void sharkEatsOtherFishes() {
        shark.eatOtherFishes();
        Assertions.assertEquals("I am eating other fishes", outContent.toString().trim());
    }
}