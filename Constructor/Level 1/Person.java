// Person class definition
class Person {
    // Attributes
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

// Test class
public class PersonTest {
    public static void main(String[] args) {
        // Original person
        Person original = new Person("Alice", 25);
        System.out.println("Original Person:");
        original.displayDetails();

        System.out.println();

        // Cloned person using copy constructor
        Person clone = new Person(original);
        System.out.println("Cloned Person:");
        clone.displayDetails();
    }
}
