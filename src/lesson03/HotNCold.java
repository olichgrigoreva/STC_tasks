package lesson03;

import java.util.Random;
import java.util.Scanner;

/**
 * Консольное Java-приложение «Горячо-Холодно»
 * <p>
 * Вначале программа «загадывает» случайное число от 1 до 100.
 * Пользователь вводит с консоли число.
 * Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно», И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее.
 * Для первого ввода пользователя считаем предыдущим введенным числом 0.
 * Предусмотреть возможность выхода из игры до отгадывания числа.
 */

public class HotNCold {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // random.nextInt(100) число от [0 до 100)
        int compNum = random.nextInt(100) + 1; //число от [1 до 100]
        int previous, humanNum;

        System.out.print("Для досрочного выхода из программы наберите '111'. ");
        System.out.println("У вас 10 попыток. " + "Введите число от 1 до 100: ");

        previous = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Попытка №" + (i));
            humanNum = scanner.nextInt();

            //угадано ли число
            if (humanNum == compNum) {
                System.out.println("Вы угадали!");
                break;
            }

            //выход из игры
            if (humanNum == 111) {
                break;
            }

            if ((Math.abs(compNum - humanNum) > previous)) {
                System.out.println("Холодно!");
            } else {
                System.out.println("Горячо!");
            }
            previous = Math.abs(compNum - humanNum);
        }
        System.out.println("Это было число: " + compNum);
    }
}
