import java.util.Scanner;

// Student class definition
class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // Method to display student details and grade
    public void displayReport() {
        System.out.println("Student Report:");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Create Student object
        Student student = new Student(name, rollNumber, marks);

        // Display student report
        System.out.println();
        student.displayReport();

        sc.close();
    }
}
