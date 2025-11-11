class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeArrayDemo {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] empArray = new Employee[3];

        // Initialize array elements with Employee objects
        empArray[0] = new Employee(101, "Nikhil", 30000);
        empArray[1] = new Employee(102, "Ravi", 35000);
        empArray[2] = new Employee(103, "Dhanshree", 40000);

        // Display all employees
        System.out.println("Employee Details:");
        for (int i = 0; i < empArray.length; i++) {
            empArray[i].display();
        }
    }
}
