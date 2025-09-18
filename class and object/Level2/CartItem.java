import java.util.ArrayList;
import java.util.Scanner;

// CartItem class definition
class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize cart item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Calculate total cost of this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getTotalCost());
    }
}

// ShoppingCart class to manage multiple CartItems
class ShoppingCart {
    private ArrayList<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Add an item to the cart
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.getItemName() + " added to the cart.");
    }

    // Remove an item from the cart by name
    public void removeItem(String itemName) {
        boolean removed = items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        if (removed) {
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Display total cost of all items in the cart
    public void displayTotalCost() {
        double total = 0;
        System.out.println("\nShopping Cart Details:");
        System.out.println("---------------------");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotalCost();
        }
        System.out.println("---------------------");
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCartTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Item Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    CartItem item = new CartItem(name, price, quantity);
                    cart.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Exiting Shopping Cart.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
