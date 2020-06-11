package lesson04;

import java.util.Scanner;

public class Progress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2, quantity, d, an;



        System.out.print("Введите число а1: ");
        a1 = scanner.nextInt();
        System.out.print("Введите число а2: ");
        a2 = scanner.nextInt();
        System.out.print("Введите количество чисел в прогрессии: ");
        quantity = scanner.nextInt();



        /*d = a2 - a1;
        System.out.print(a1 + " " + a2 + " ");

        int i = 2;
        while (i != quantity) {
            ++i;
            an = a1 + d * (i - 1);
            System.out.print(an + " ");
        }*/
    }
}
