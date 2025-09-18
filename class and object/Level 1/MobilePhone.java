import java.util.Scanner;

// MobilePhone class definition
class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize mobile phone details
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("---------------------");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input mobile phone details
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display details
        System.out.println();
        phone.displayDetails();

        sc.close();
    }
}
