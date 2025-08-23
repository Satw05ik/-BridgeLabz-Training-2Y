import java.util.Scanner;

public class Feet_To_Yard_Mile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double yards = distanceInFeet / 3.0;     // 1 yard = 3 feet
        double miles = yards / 1760.0;          // 1 mile = 1760 yards

        // Printing result
        System.out.println("The distance in feet is " + distanceInFeet +
                           " which is " + yards + " yards and " + miles + " miles");

        input.close();
    }
}
