
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}


class Intern extends Employee {
    String duration;

    public Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 101, 90000, 5);
        Developer d1 = new Developer("Bob", 102, 60000, "Java");
        Intern i1 = new Intern("Charlie", 103, 20000, "6 months");

        System.out.println("=== Manager Details ===");
        m1.displayDetails();
        System.out.println("\n=== Developer Details ===");
        d1.displayDetails();
        System.out.println("\n=== Intern Details ===");
        i1.displayDetails();
    }
}