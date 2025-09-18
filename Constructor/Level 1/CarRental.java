// CarRental class definition
class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public CarRental() {
        this("Unknown Customer", "Standard Car", 1, 50.0); // Default values
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("------------------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Daily Rate    : " + dailyRate);
        System.out.println("Total Cost    : " + calculateTotalCost());
    }
}

// Test class
public class CarRentalTest {
    public static void main(String[] args) {
        // Default rental
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayDetails();

        System.out.println();

        // Parameterized rental
        CarRental paramRental = new CarRental("John Doe", "Toyota Corolla", 5, 75.0);
        System.out.println("Parameterized Rental:");
        paramRental.displayDetails();
    }
}
