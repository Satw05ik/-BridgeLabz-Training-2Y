import java.util.Scanner;

// Circle class definition
class Circle {
    // Attribute
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.printf("Circle Details:%n");
        System.out.printf("Radius         : %.2f%n", radius);
        System.out.printf("Area           : %.2f%n", calculateArea());
        System.out.printf("Circumference  : %.2f%n", calculateCircumference());
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Create Circle object
        Circle circle = new Circle(radius);

        // Display circle details
        System.out.println();
        circle.displayDetails();

        sc.close();
    }
}
