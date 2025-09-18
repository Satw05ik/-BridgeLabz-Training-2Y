import java.util.Scanner;

// Employee class definition
class Employee {
    // Attributes
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize the employee
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("-----------------");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
pri
        // Create an Employee object
        Employee emp = new Employee(name, id, salary);

        // Display employee details
        System.out.println();
        emp.displayDetails();

        sc.close();
    }
}
 