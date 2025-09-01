import java.util.Scanner;

public class Number_Analysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                System.out.print(num + " is positive and ");
                if (num % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last elements:");
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }
        sc.close();
    }
}
