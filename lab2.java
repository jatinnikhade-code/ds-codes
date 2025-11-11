import java.io.*;

// Employee class
class Employee {
    // Data members
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID    : " + id);
        System.out.println("Employee Name  : " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// Test class
public class EmployeeTest {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp1 = new Employee(101, "John Doe", 50000);

        // Display Employee details
        System.out.println("Employee Details:");
        emp1.displayDetails();
    }
}
