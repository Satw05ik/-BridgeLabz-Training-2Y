import java.util.Scanner;

// MovieTicket class definition
class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked; // Flag to check if seat is booked

    // Constructor to initialize movie ticket details
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked! Choose another seat.");
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        System.out.println("\nMovie Ticket Details:");
        System.out.println("---------------------");
        System.out.println("Movie Name : " + movieName);
        if (isBooked) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : " + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input movie name
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName);

        // Book ticket
        System.out.print("Enter Seat Number to Book: ");
        String seat = sc.nextLine();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        ticket.bookTicket(seat, price);

        // Display ticket details
        ticket.displayTicket();

        sc.close();
    }
}
