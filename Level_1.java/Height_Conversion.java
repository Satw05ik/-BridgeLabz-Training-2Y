import java.util.Scanner;

public class Height_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double inches = heightCm / 2.54;    
        int feet = (int) (inches / 12);      
        double remainingInches = inches % 12;

    
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + remainingInches);

        input.close();
    }
}
