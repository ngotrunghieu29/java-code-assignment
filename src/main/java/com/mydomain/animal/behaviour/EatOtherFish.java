package com.mydomain.animal.behaviour;

public interface EatOtherFish {
    default void eatOtherFishes() {
        System.out.println("I am eating other fishes");
    }
}
