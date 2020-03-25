package com.mydomain.animal.behaviour;

public interface Singable {
    default void sing() {
        System.out.println("I am singing");
    }

    default boolean canSing() {
        return true;
    }
}
