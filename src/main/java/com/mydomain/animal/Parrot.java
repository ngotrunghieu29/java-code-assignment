package com.mydomain.animal;

import com.mydomain.animal.behaviour.Singable;

public class Parrot extends Bird {
    private Singable singableAnimal;

    public Parrot(Singable singableAnimal) {
        this.singableAnimal = singableAnimal;
    }

    public Parrot() {
        this.singableAnimal = new Bird();
    }

    @Override
    public void sing() {
        this.singableAnimal.sing();
    }
}
