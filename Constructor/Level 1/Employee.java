// Base class: Employee
class Employee {
    public int employeeID;        // Public: accessible everywhere
    protected String department;  // Protected: accessible in same package + subclass
    private double salary;        // Private: only inside Employee class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (private via getter): " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Method to demonstrate access to public and protected attributes
    public void displayManagerDetails() {
        System.out.println("Manager Employee ID (public): " + employeeID);     // Public accessible
        System.out.println("Manager Department (protected): " + department);   // Protected accessible
        System.out.println("Team Size: " + teamSize);
    }
}

// Driver class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create Employee object
        Employee e1 = new Employee(101, "IT", 55000.0);
        e1.displayEmployeeDetails();

        // Modify salary
        e1.setSalary(60000);
        System.out.println("Updated Salary: " + e1.getSalary());

        System.out.println("-----------------------------");

        // Create Manager object
        Manager m1 = new Manager(201, "HR", 75000.0, 10);
        m1.displayEmployeeDetails();   // From parent
        m1.displayManagerDetails();    // From subclass
    }
}
