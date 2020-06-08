package lesson03;

import java.util.Random;
import java.util.Scanner;

/**
 * Консольное Java-приложение «Горячо-Холодно»
 *
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
        int previous, humanNum, current;

        System.out.print("У вас 10 попыток. " + "Введите число от 0 до 100: ");
        humanNum = scanner.nextInt();

        previous = 0;
        current = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Попытка №" + (i + 1));
            if (humanNum == compNum) {
                System.out.println("Вы угадали!");
                break;
            } else {
                if (Math.abs(humanNum - current) > previous) {
                    System.out.println("Холодно!");
                    current = humanNum;
                    previous = Math.abs(current - previous);
                    humanNum = scanner.nextInt();
                } else {
                    System.out.println("Горячо!");
                    current = humanNum;
                    previous = Math.abs(current - previous);
                    humanNum = scanner.nextInt();
                }
            }
        }
        System.out.println("Это было число: " + compNum);
    }
}
