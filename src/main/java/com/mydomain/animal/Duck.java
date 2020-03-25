package com.mydomain.animal;

import com.mydomain.animal.behaviour.Swimmable;

public class Duck extends Bird implements Swimmable {
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
