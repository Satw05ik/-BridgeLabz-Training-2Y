import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            long factorial = 1; 
            int counter = 1;

            while (counter <= number) {
                factorial *= counter;
                counter++;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        sc.close();
    }
}