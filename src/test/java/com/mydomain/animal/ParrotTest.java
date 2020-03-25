package com.mydomain.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParrotTest extends BaseTest {

    @Test
    public void parrotLivingWithDogsShouldSayWoofWoof() {
        Parrot parrot = new Parrot(new Dog());
        parrot.sing();
        Assertions.assertEquals("Woof, woof", outContent.toString().trim());
    }

    @Test
    public void parrotLivingWithCatsShoudSayMeow() {
        Parrot parrot = new Parrot(new Cat());
        parrot.sing();
        Assertions.assertEquals("Meow", outContent.toString().trim());
    }

    @Test
    public void parrotLivingWithRoostersShouldSayCockADoodleDoo() {
        Parrot parrot = new Parrot(new Rooster());
        parrot.sing();
        Assertions.assertEquals("Cock-a-doodle-doo", outContent.toString().trim());
    }

    @Test
    public void parrotLivingWithDucksShouldSayQuackQuack() {
        Parrot parrot = new Parrot(new Duck());
        parrot.sing();
        Assertions.assertEquals("Quack, quack", outContent.toString().trim());
    }

    @Test
    public void parrotStillIsABirdItself() {
        Parrot parrot = new Parrot();
        parrot.sing();
        Assertions.assertEquals("I am singing", outContent.toString().trim());
    }

}