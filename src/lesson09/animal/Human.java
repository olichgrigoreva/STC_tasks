package lesson09.animal;

import lesson09.Run;
import lesson09.Swim;

public abstract class Human implements Run, Swim {
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
