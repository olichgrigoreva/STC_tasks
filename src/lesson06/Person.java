package lesson06;

class Person {
    private String firstName;
    private String secondName;
    private int age;

    //конструктор
    Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    String getName() {
        return firstName + " " + secondName;
    }

    void display(){
        System.out.println("Person class method");
        System.out.println("Name: " + firstName);
        System.out.println("Second name: " + secondName);
    }
}
