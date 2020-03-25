package com.mydomain.animal.behaviour;

public interface Flyable {
    default void fly() {
        System.out.println("I am flying");
    }

    default boolean canFly() {
        return true;
    }
}
