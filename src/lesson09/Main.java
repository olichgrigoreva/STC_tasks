package lesson09;

import lesson09.animal.*;

public class Main {

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.getName();
        bear.run();
        bear.swim();

        Duck duck = new Duck();
        duck.getName();
        duck.fly();
        duck.run();
        duck.swim();

        Fish fish = new Fish();
        fish.getName();
        fish.swim();

        System.out.println();

        Human adult = new Adult(40);
        Human child = new Child(25);

        System.out.println("Adult. Age: " + adult.getAge());
        adult.run();
        System.out.println(adult.swimRecommended(adult.getAge()));

        System.out.println("_______________________________________________");

        System.out.println("Child. Age: " + child.getAge());
        child.swim();
        System.out.println(child.runRecommended(child.getAge()));

        //Методы, чтобы лучше понять слабую связанность
        Animal animal = new Bear();
        Animal.method(animal);
        Animal.method2(animal); //вызовется метод для Bear

        Bear.bearMethod(animal);
    }
}
