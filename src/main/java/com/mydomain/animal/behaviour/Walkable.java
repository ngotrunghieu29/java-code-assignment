package com.mydomain.animal.behaviour;

public interface Walkable {
    default void walk() {
        System.out.println("I am walking");
    }

    default boolean canWalk() {
        return true;
    }
}
