import java.util.Scanner;

// Item class definition
class Item {
    // Attributes
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the item
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    public void displayDetails(int quantity) {
        System.out.println("Item Details:");
        System.out.println("-------------");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input item details
        System.out.print("Enter Item Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Create Item object
        Item item = new Item(code, name, price);

        // Display item details and total cost
        System.out.println();
        item.displayDetails(quantity);

        sc.close();
    }
}
