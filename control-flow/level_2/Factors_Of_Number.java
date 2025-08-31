import java.util.Scanner;

public class Factors_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}