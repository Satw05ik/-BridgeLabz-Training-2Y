// Base class: Student
class Student {
    public int rollNumber;       // Public: accessible everywhere
    protected String name;       // Protected: accessible in same package + subclasses
    private double CGPA;         // Private: only accessible inside Student class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter for CGPA
    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Accessing protected member 'name'
    public void displayPGDetails() {
        System.out.println("PG Student Name: " + name); // 'name' is protected, accessible here
        System.out.println("Specialization: " + specialization);
    }
}

// Driver class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create base student
        Student s1 = new Student(101, "Akshay", 8.5);
        s1.displayStudentDetails();

        // Modify CGPA using public method
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        System.out.println("------------------------------");

        // Create postgraduate student
        PostgraduateStudent pg = new PostgraduateStudent(201, "Rahul", 8.8, "Computer Science");
        pg.displayStudentDetails();   // From parent class
        pg.displayPGDetails();        // From subclass
    }
}
