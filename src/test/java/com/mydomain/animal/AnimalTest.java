package com.mydomain.animal;

import com.mydomain.animal.insect.Butterfly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    public void countAnimalsCanFlyWithButterflyAsCaterpillar() {
        Butterfly butterfly = new Butterfly();
        Animal[] animals = new Animal[]{
                new Bird(), // can fly
                new Duck(), // can fly
                new Chicken(),
                new Rooster(),
                new Parrot(), // can fly
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                butterfly,
                new Cat()
        };
        Assertions.assertEquals(3, Animal.countAnimalsCanFly(animals));
    }

    @Test
    public void countAnimalsCanFlyWithButterfly() {
        Butterfly butterfly = new Butterfly();
        butterfly.becomeButterfly();
        Animal[] animals = new Animal[]{
                new Bird(), // can fly
                new Duck(), // can fly
                new Chicken(),
                new Rooster(),
                new Parrot(), // can fly
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                butterfly, // can fly
                new Cat()
        };
        Assertions.assertEquals(4, Animal.countAnimalsCanFly(animals));
    }

    @Test
    public void countAnimalsCanWalkWithButterflyAsCaterpillar() {
        Butterfly butterfly = new Butterfly();
        Animal[] animals = new Animal[]{
                new Bird(), // can walk
                new Duck(), // can walk
                new Chicken(), // can walk
                new Rooster(), // can walk
                new Parrot(), // can walk
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(), // can walk
                new Dog(), // can walk
                butterfly, // can walk
                new Cat() // can walk
        };
        Assertions.assertEquals(9, Animal.countAnimalsCanWalk(animals));
    }

    @Test
    public void countAnimalsCanWalkWithButterfly() {
        Butterfly butterfly = new Butterfly();
        butterfly.becomeButterfly();
        Animal[] animals = new Animal[]{
                new Bird(), // can walk
                new Duck(), // can walk
                new Chicken(), // can walk
                new Rooster(), // can walk
                new Parrot(), // can walk
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(), // can walk
                new Dog(), // can walk
                butterfly,
                new Cat() // can walk
        };
        Assertions.assertEquals(8, Animal.countAnimalsCanWalk(animals));
    }

    @Test
    public void countAnimalsCanSing() {
        Animal[] animals = new Animal[]{
                new Bird(), // can sing
                new Duck(), // can sing
                new Chicken(), // can sing
                new Rooster(), // can sing
                new Parrot(), // can sing
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(), // can sing
                new Butterfly(),
                new Cat() // can sing
        };
        Assertions.assertEquals(7, Animal.countAnimalsCanSing(animals));
    }

    @Test
    public void countAnimalsCanSwim() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(), // can swim
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(), // can swim
                new Shark(), // can swim
                new Clownfish(), // can swim
                new Dolphin(), // can swim
                new Frog(), // can swim
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        Assertions.assertEquals(6, Animal.countAnimalsCanSwim(animals));
    }


}