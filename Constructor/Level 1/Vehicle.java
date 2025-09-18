class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared across all objects)
    private static double registrationFee = 5000; // Default value

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------------");
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }
}

// Driver class
public class VehicleManagement {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("Akshay", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        // Display details before updating fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(7000);

        // Display details after updating fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
