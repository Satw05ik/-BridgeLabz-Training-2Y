import java.util.Scanner;

public class Array_Input_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");

        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }
            if (index >= 10) {
                System.out.println("Array is full. Cannot accept more numbers.");
                break;
            }

            numbers[index] = input;
            index++;
        }
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\n\nSum of all numbers: " + total);
        sc.close();
    }
}