package com.mydomain.animal;

import com.mydomain.animal.behaviour.Flyable;
import com.mydomain.animal.behaviour.Singable;
import com.mydomain.animal.behaviour.Swimmable;
import com.mydomain.animal.behaviour.Walkable;

public abstract class Animal implements Walkable {
    public static int countAnimalsCanFly(Animal[] animals) {
        int result = 0;
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                Flyable flyable = (Flyable) animal;
                if (flyable.canFly()) result++;
            }
        }
        return result;
    }

    public static int countAnimalsCanWalk(Animal[] animals) {
        int result = 0;
        for (Animal animal : animals) {
            Walkable walkable = animal;
            if (walkable.canWalk()) result++;
        }
        return result;
    }

    public static int countAnimalsCanSing(Animal[] animals) {
        int result = 0;
        for (Animal animal : animals) {
            if (animal instanceof Singable) {
                Singable singable = (Singable) animal;
                if (singable.canSing()) result++;
            }
        }
        return result;
    }

    public static int countAnimalsCanSwim(Animal[] animals) {
        int result = 0;
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                Swimmable swimmable = (Swimmable) animal;
                if (swimmable.canSwim()) result++;
            }
        }
        return result;
    }
}
