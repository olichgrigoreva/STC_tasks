package lesson06;

class Employee extends Person {
    private String company;

    //конструктор
    Employee(String firstName, String secondName, int age, String company) {
        super(firstName, secondName, age);
        this.company = company;
    }

    String getCompany(){
        return company;
    }

    @Override
    void display() {
        System.out.println("override метод. " + "Name: " + super.getName());
    }
}
