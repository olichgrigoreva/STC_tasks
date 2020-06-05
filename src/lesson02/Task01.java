package lesson02;

public class Task01 {
    public static void main(String[] args) {
        /**
         * рассчет стоимости бензина
         */
        int litres = 30;
        double price, cost;

        price = 43.25;
        cost = litres * price;
        System.out.println("Task 01");
        System.out.println("Стоимость бензина: " + cost);

        /**
         * рассчет запрлаты "на руки"
         */
        System.out.println("Task 02");
        new Task02();

        /**
         * конвертация секунд в часы
         */
        System.out.println("Task 03");
        new Task03();
    }
}
