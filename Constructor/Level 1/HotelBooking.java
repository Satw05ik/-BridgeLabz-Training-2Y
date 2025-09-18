// HotelBooking class definition
class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Unknown Guest", "Standard", 1); // Calls parameterized constructor
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Hotel Booking Details:");
        System.out.println("----------------------");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
    }
}

// Test class
public class HotelBookingTest {
    public static void main(String[] args) {
        // Default booking
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println();

        // Parameterized booking
        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        paramBooking.displayBooking();

        System.out.println();

        // Copy booking
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copy Booking:");
        copyBooking.displayBooking();
    }
}
