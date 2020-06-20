package lesson06;

class Department extends Person{

    private String department;
    private int salary;


    Department(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    String getDepartment() {
        return department;
    }

    int getSalary(int salary) {
        return salary;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
}
