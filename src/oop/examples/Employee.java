package oop.examples;

public class Employee {

    String name;
    String position;
    double salary;

    //alt + insert -> Generate Constructor
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfoEmployee() {
        System.out.println(" Name: " + name + ";\n Position: " + position + ";\n Salary: " + salary + ";");
    }
}
