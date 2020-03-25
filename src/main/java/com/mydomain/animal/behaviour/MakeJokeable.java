package com.mydomain.animal.behaviour;

public interface MakeJokeable {
    default void makeJoke() {
        System.out.println("I am making jokes");
    }
}
