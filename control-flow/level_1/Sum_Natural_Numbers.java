import java.util.Scanner;

public class Sum_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;

            int sumWhile = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhile += counter;
                counter++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);

            if (sumFormula == sumWhile) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("The computations do not match!");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
        sc.close();
    }
}
