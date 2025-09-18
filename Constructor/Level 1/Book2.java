// Base class: Book
class Book2 {
    public String ISBN;       // Public: accessible everywhere
    protected String title;   // Protected: accessible in same package + subclasses
    private String author;    // Private: only inside Book class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    private String fileFormat;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Demonstrating access to public and protected members
    public void displayEBookDetails() {
        System.out.println("EBook ISBN (public): " + ISBN);   // Public accessible
        System.out.println("EBook Title (protected): " + title); // Protected accessible
        System.out.println("File Format: " + fileFormat);
    }
}

// Driver class
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create Book object
        Book b1 = new Book("978-1234567890", "Java Programming", "Herbert Schildt");
        b1.displayBookDetails();

        // Modify author using setter
        b1.setAuthor("James Gosling");
        System.out.println("Updated Author: " + b1.getAuthor());

        System.out.println("------------------------------");

        // Create EBook object
        EBook eb1 = new EBook("978-0987654321", "Effective Java", "Joshua Bloch", "PDF");
        eb1.displayBookDetails();   // From parent class
        eb1.displayEBookDetails();  // From subclass
    }
}
