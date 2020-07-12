package lesson04;

import java.util.Scanner;

/**
 * Программа для поиска минимального из двух чисел
 */

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("Введите число a: ");
        a = scanner.nextInt();
        System.out.print("Введите число b: ");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("Числа a и b равны!");
            System.exit(0);
        }

        if (a > b) {
            System.out.println("Минимальное число: " + b);
        } else {
            System.out.println("Минимальное число: " + a);
        }
    }
}
