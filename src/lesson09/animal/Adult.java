package lesson09.animal;

public class Adult extends Human {
    public Adult(int age) {
        super(age);
    }

    private String message;

    @Override
    public void run() {
        System.out.println("Run slower; ");
    }

    @Override
    public String runRecommended(int age) {
        if (age < 40) {
            message = "Let's run";
        } else {
            message = "running doesn't recommended";
        }
        return message;
    }

    @Override
    public void swim() {
        System.out.println("Swim slower; ");
    }

    @Override
    public String swimRecommended(int age) {
        if (age < 60) {
            message = "Let's swim";
        } else {
            message = "swimming doesn't recommended";
        }
        return message;
    }
}
