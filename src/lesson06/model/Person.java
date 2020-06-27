package lesson06.model;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String showPerson(){
        System.out.println(firstName + " " + lastName);
        return null;
    }
}
