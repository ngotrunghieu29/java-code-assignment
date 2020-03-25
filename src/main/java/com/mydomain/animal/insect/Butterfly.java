package com.mydomain.animal.insect;

import com.mydomain.animal.Animal;
import com.mydomain.animal.behaviour.Flyable;
import com.mydomain.animal.behaviour.Walkable;

public class Butterfly extends Animal implements Flyable, Walkable {
    private State state;

    public Butterfly() {
        this.state = new CaterpillarState();
    }

    public void becomeButterfly() {
        this.state = new ButterflyState();
    }

    @Override
    public void fly() {
        state.fly();
    }

    @Override
    public boolean canFly() {
        return state.canFly();
    }

    @Override
    public void walk() {
        state.walk();
    }

    @Override
    public boolean canWalk() {
        return state.canWalk();
    }

}
