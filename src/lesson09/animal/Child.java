package lesson09.animal;

public class Child extends Human{

    String message;

    public Child(int age) {
        super(age);
    }

    @Override
    public void run() {
        System.out.println("Run faster; ");
    }

    @Override
    public String runRecommended(int age) {
        message = "You are young. We recommend running";
        return message;
    }

    @Override
    public void swim() {
        System.out.println("Swim faster; ");
    }

    @Override
    public String swimRecommended(int age) {
        message = "You are young. We recommend swimming";
        return message;
    }
}
