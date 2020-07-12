package lesson04;

import java.util.Scanner;

/**
 *  Программа, которая выводит арифметическую или геометрическую прогрессию для N чисел
 */

public class Progress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2, quantity, d, an;
        double bn;
        String progressType;

        System.out.print("Введите А (ru) для арифметической прогрессии, любой символ - для геометрической: ");
        progressType = scanner.next();

        //ввод данных
        System.out.print("Введите число а1: ");
        a1 = scanner.nextInt();
        System.out.print("Введите число а2: ");
        a2 = scanner.nextInt();
        System.out.print("Введите количество чисел в прогрессии: ");
        quantity = scanner.nextInt();

        if (progressType.equals("А")) {
            System.out.println("Арифметическая прогрессия");
            System.out.print(a1 + " " + a2 + " ");

            int i = 2;
            d = a2 - a1;
            while (i != quantity) {
                ++i;
                an = a1 + d * (i - 1);
                System.out.print(an + " ");
            }
        } else {
            System.out.println("Геометрическая прогрессия");
            System.out.print(a1 + " " + a2 + " ");

            int i = 2;
            d = a2 / a1;
            while (i != quantity) {
                ++i;
                bn = a1 * Math.pow(d, i - 1);
                System.out.print(bn + " ");
            }
        }
    }
}
