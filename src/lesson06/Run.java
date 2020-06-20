package lesson06;

public class Run {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "Hardy", 34);
        System.out.println(tom.getName());

        System.out.println();
        tom.display();

        Employee ben = new Employee("Ben", "Stiller", 35, "Oracle");
        System.out.println();
        System.out.println(ben.getName() + " ");
        System.out.println(ben.getCompany());

        System.out.println();
        ben.display(); // override метод класса Employee

        //полиморфизм?
        Person ann = new Department("Ann", "Pavlova", 28);
        System.out.println();
        ann.display();
        //ann.getSalary(70000); //не работает если указан тип Person
    }

}
