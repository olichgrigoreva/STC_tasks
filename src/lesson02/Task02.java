package lesson02;

import java.util.Scanner;

/**
 * рассчет запрлаты "на руки"
 */

public class Task02 {
    Scanner scanner = new Scanner(System.in);
    int salary;
    double tax, total_salary;

    public Task02() {
        tax = 0.13;
        salary = scanner.nextInt();
        total_salary = salary - salary * tax;
        System.out.println("Зарплата 'на руки': " + total_salary);
    }
}
