package lesson02;

/**
 * рассчет запрлаты "на руки"
 */

public class Task02 {
    int salary = 75000;
    double tax, total_salary;

    public Task02(){
        tax = 0.13;
        total_salary = salary - salary * tax;
        System.out.println("Зарплата 'на руки': " + total_salary);
    }
}
