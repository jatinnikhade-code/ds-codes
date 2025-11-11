// Employee class
class Employee {
    // Private data members
    private int id;
    private String name;
    private double salary;

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// Test class with main method
public class EmployeeTest {
    public static void main(String[] args) {
        // First Employee
        Employee emp1 = new Employee(101, "Priya Sharma", 45000);

        // Second Employee
        Employee emp2 = new Employee(102, "Rahul Verma", 55000);

        // Display employee details
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}
