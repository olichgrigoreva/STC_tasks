package lesson07;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        int productId, getProdPrice;
        int start;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Доступные для покупки позиции: ");
            Cookies.availableProducts();

            System.out.print("Введите номер товара или -1 для завершения работы ");
            productId = scanner.nextInt();

            if (productId < 0){
                break;
            }

            if (productId < Cookies.values().length) {
                Cookies selectedItem = Cookies.values()[productId];
                System.out.println("Вы выбрали: " + selectedItem);

                System.out.println("Внесите деньги: ");
                getProdPrice = scanner.nextInt();

                MoneyOperation.payment(selectedItem,getProdPrice);

            } else {
                System.out.println("Товара нет. Проверьте идентификатор!");
            }
        }
    }
}

