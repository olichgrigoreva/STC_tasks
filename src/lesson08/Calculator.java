package lesson08;

public class Calculator {
    public static double sum(double a, double b) {
        System.out.println("sum double");
        return a + b;
    }

    public static int sum(int a, int b) {
        System.out.println("sum int");
        return a + b;
    }

    public static double subtract(double a, double b) {
        System.out.println("subtract double");
        return a - b;
    }

    public static int subtract(int a, int b) {
        System.out.println("subtract int");
        return a - b;
    }

    public static double multiplication(double a, double b) {
        System.out.println("multiplication double");
        return a * b;
    }

    public static int multiplication(int a, int b) {
        System.out.println("multiplication int");
        return a * b;
    }

    public static double division(double a, double b) {
        System.out.println("division double");
        return a / b;
    }

    public static int division(int a, int b) {
        System.out.println("division int");
        return a / b;
    }

    public static double persent(double num, double percent) {
        System.out.println("persent double");
        return num * percent / 100;
    }

    public static int persent(int num, int percent) {
        System.out.println("persent int");
        return num * percent / 100;
    }
}
