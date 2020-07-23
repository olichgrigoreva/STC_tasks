package lesson09;

public abstract class Animal {
    public abstract void getName();

    public static void method (Animal animal){
        System.out.println("Метод, чтобы лучше понять слабую связанность");
    }

    public static void method2 (Animal animal){
        System.out.println("2й метод, чтобы лучше понять слабую связанность");
        animal.getName();
    }
}
