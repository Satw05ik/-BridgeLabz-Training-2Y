// Product class definition
class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all Product objects)
    private static int totalProducts = 0;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("----------------");
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

// Test class
public class ProductInventoryTest {
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 55000);
        Product product2 = new Product("Smartphone", 22000);
        Product product3 = new Product("Headphones", 2500);

        // Display individual product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();

        System.out.println();

        // Display total products
        Product.displayTotalProducts();
    }
}
