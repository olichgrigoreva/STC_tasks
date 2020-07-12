package lesson09.animal;

import lesson09.Animal;
import lesson09.Swim;

public class Fish extends Animal implements Swim {
    @Override
    public void getName() {
        System.out.println("This is fish");
    }

    @Override
    public void swim() {
        System.out.println("I can swim; ");
    }

    @Override
    public String swimRecommended(int age) {
        return null;
    }
}
