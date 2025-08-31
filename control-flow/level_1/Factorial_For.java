import java.util.Scanner;

public class Factorial_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            long factorial = 1; 
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        sc.close();
    }
}