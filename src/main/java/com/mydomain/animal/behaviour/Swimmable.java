package com.mydomain.animal.behaviour;

public interface Swimmable {
    default void swim() {
        System.out.println("I am swimming");
    }

    default boolean canSwim() {
        return true;
    }
}
