package com.mydomain.animal.insect;

public class CaterpillarState extends State {
    @Override
    public void fly() {
        // do nothing
    }

    @Override
    public boolean canFly() {
        return false;
    }

}
