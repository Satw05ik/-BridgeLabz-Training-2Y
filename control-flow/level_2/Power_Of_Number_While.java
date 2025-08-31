import java.util.Scanner;

public class Power_Of_Number_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers for both base and power.");
        } else {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        sc.close();
    }
}