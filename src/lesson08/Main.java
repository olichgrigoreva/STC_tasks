package lesson08;

import lesson08.Converter.Act;
import lesson08.Converter.Contract;
import lesson08.Converter.Converter;

import java.util.Date;

import static lesson08.ObjCounter.counter;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Реализовать класс Calculator, который будет содержать статические методы для
         * операций вычитания, сложения, умножения, деления и взятия процента от числа.
         * Класс должен работать как с целыми числами, так и с вещественными.
         */
        //task 1
        int a = 3, b = 5;
        double c = 3, d = 0.8;
        System.out.println(Calculator.division(a, b));
        System.out.println(Calculator.division(a, c));

        /**
         * 2. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
         * Написать метод для получения информации о количестве.
         */
        //task 2
        ObjCounter obj1 = new ObjCounter();
        counter();
        ObjCounter obj2 = new ObjCounter();
        counter();

        /**
         * 3. Реализовать два класса: договор и акт.
         * В каждом сделать поля: номер, дата, список товаров (массив строк).
         * Написать класс со статическим методом конвертации договора в акт
         * (на вход передавать договор, на выходе получаем акт).
         */
        //task 3
        String[] products = new String[]{"Cup", "Plate", "Fork"};
        Contract contract = new Contract(01, new Date(12), products);
        Act act = new Act(01, new Date(12), products);

        contract.testObj();
        act = Converter.convert(contract, act);
        act.testObj();
    }
}
