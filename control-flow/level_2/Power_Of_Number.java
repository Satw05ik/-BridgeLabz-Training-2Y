import java.util.Scanner;

public class Power_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers for both base and power.");
        } else {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        sc.close();
    }
}