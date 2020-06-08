package lesson02;

import java.util.Scanner;

/**
 * конвертация секунд в часы
 */

public class Task03 {
    int sec;
    int hours, minutes;
    int secInHour = 3600;
    int secInMinute = 60;
    int restSec;

    public Task03() {
        Scanner scanner = new Scanner(System.in);
        sec = scanner.nextInt();

        hours = sec / secInHour;
        minutes = (sec - hours * secInHour) / secInMinute;
        restSec = sec - hours * secInHour - minutes * secInMinute;
        System.out.println("В " + sec + " сек: " + hours + " часов, " + minutes + " минут, " + restSec + " секунд");
    }
}
