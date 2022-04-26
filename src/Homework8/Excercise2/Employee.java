package Homework8.Excercise2;

import java.util.Scanner;

public class Employee {
    final String firstName = "John";
    final String lastName = "Atanasov";

    private double salary = 400;
    private double percentage = 20;

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary() {
        return getAnnualSalary() * percentage / 100 + getAnnualSalary();
    }

    public String toString() {
        return "Name: " + this.getName() + "\n"
                + "Annual Salary: " + this.getAnnualSalary() + "\n"
                + "Percentage raise is: " + this.percentage + "%" + "\n"
                + "New Salary: " + this.raiseSalary();
    }

    public static void main(String[] args) {
        Employee myEmployee = new Employee();

        System.out.println(myEmployee.toString());
    }
}
