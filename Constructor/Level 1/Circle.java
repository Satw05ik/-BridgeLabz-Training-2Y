// Circle class definition
class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default radius 1.0
    }

    // Parameterized constructor
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
        System.out.printf("Radius        : %.2f%n", radius);
        System.out.printf("Area          : %.2f%n", calculateArea());
        System.out.printf("Circumference : %.2f%n", calculateCircumference());
    }
}

// Test class
public class CircleTest {
    public static void main(String[] args) {
        // Circle with default radius
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        System.out.println();

        // Circle with user-provided radius
        Circle customCircle = new Circle(5.5);
        System.out.println("Custom Circle:");
        customCircle.displayDetails();
    }
}
