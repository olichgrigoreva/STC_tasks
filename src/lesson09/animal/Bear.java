package lesson09.animal;

import lesson09.Animal;
import lesson09.Run;
import lesson09.Swim;

public class Bear extends Animal implements Run, Swim {
    @Override
    public void getName() {
        System.out.println("This is bear");
    }

    @Override
    public void run() {
        System.out.print("I can run; ");
    }

    @Override
    public String runRecommended(int age) {
        return null;
    }

    @Override
    public void swim() {
        System.out.println("I can swim; ");
    }

    @Override
    public String swimRecommended(int age) {
        return null;
    }

    public static void bearMethod(Animal animal){
        animal.getClass();
    }
}
