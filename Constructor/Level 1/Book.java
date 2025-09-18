// Book class definition
class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("-------------");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }
}

// Test class
public class BookTest {
    public static void main(String[] args) {
        // Creating book using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayDetails();

        System.out.println();

        // Creating book using parameterized constructor
        Book paramBook = new Book("Effective Java", "Joshua Bloch", 45.50);
        System.out.println("Parameterized Book:");
        paramBook.displayDetails();
    }
}
