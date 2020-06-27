package lesson06;

import lesson06.model.*;

public class Main {
    public static void main(String[] args) {

        //использует конструктор person (родительского класса)
        Employee employee = new Employee("Анна", "Павлова", "Библиотекарь");
        employee.showPerson();
        employee.setPosition("Заведующая"); //смена должности
        System.out.println(employee.getPosition());

        //создаем библиотеку
        Library library = new Library();
        //добавили объект (передали ссылку) в списки сотрудников в библиотеке
        library.addEmployee(employee);

        Person[] persons;
        persons = new Person[3]; //почему я не могу создать массив внутри Library???
        persons[0] = new Person("Илья", "Прусаков");
        persons[1] = new Reader("Екатерина", "Суворова", 5);

        String str = persons[1].showPerson();
    }
}
