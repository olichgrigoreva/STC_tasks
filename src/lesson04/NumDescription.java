package lesson04;

import java.util.Scanner;

/**
 * Описание введенного числа.
 * Отрицательное оно число или положительное (или нулевое), чётное или нечётное
 */

public class NumDescription {

    //нечетное или четное число
    static boolean oddEven(int num_oe) {
        return num_oe % 2 == 0;
    }

    static String positiveNegative(int num_pn) {
        String result;
        if (num_pn == 0) {
            result = "Число равно нулю";
        } else {
            if (num_pn > 0) {
                result = "Положительное число";
            } else {
                result = "Отрицательное число";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String result_pn;

        System.out.print("Введите целое число: ");
        number = scanner.nextInt();
        result_pn = positiveNegative(number);

        if (oddEven(number)) {
            System.out.println("Четное число. " + result_pn);
        } else {
            System.out.println("Нечетное число. " + result_pn);
        }
    }
}
