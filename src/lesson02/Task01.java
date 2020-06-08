package lesson02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /**
         * рассчет стоимости бензина
         */
        Scanner scanner = new Scanner(System.in);
        double price, cost;
        int litres;

        price = 43.25;
        System.out.println("Task 01");
        System.out.print("Введите кол-во литров: ");
        litres = scanner.nextInt();
        cost = litres * price;
        System.out.println("Стоимость бензин: " + cost);

        /**
         * рассчет запрлаты "на руки"
         */
        System.out.println("Task 02");
        System.out.print("Введите значение зарплаты: ");
        new Task02();

        /**
         * конвертация секунд в часы
         */
        System.out.println("Task 03");
        System.out.print("Введите кол-во секунд: ");
        new Task03();
    }
}
