package lesson07;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        int productId, getProdPrice;
        String start;
        Scanner scanner = new Scanner(System.in);
        Scanner pause = new Scanner(System.in);

        while (true) {
            System.out.println("Для начала работы нажмите Enter");
            System.out.println("Для начала работы введите Esc");

            start = pause.nextLine(); //пауза

            if (start.equals("Esc")){
                break;
            }

            System.out.println("Доступные для покупки позиции: ");
            int count = 0;

            for (Cookies cookies : Cookies.values()) {
                System.out.print(count + " ");
                System.out.println(cookies + ": " + cookies.getPrice() + " руб");
                count++;
            }

            System.out.print("Введите номер товара: ");
            productId = scanner.nextInt();

            if (productId < Cookies.values().length) {
                System.out.println("Вы выбрали: " + Cookies.values()[productId]);

                System.out.println("Внесите деньги: ");
                // TODO сделать счетчик ожидания
                getProdPrice = scanner.nextInt();

                if (Cookies.values()[productId].getPrice() == getProdPrice) {
                    System.out.println("Спасибо за покупку!");
                } else if (Cookies.values()[productId].getPrice() > getProdPrice) {
                    System.out.println("Недостаточно средств!");
                } else {
                    System.out.println("Автомат сдачи не выдает! Спасибо за покупку!");
                }

            } else {
                System.out.println("Товара нет. Проверьте идентификатор!");
            }
        }
    }
}
