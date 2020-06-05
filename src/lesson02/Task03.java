package lesson02;

/**
 * конвертация секунд в часы
 */

public class Task03 {
    int sec = 4502;
    int hours, minutes;
    int secInHour = 3600;
    int secInMinute = 60;
    int restSec;

    public Task03() {
        hours = sec / secInHour;
        minutes = (sec - hours * secInHour) / secInMinute;
        restSec = sec - hours * secInHour - minutes * secInMinute;
        System.out.println("В " + sec + " сек: " + hours + " часов, " + minutes + " минут, " + restSec + " секунд");
    }
}
