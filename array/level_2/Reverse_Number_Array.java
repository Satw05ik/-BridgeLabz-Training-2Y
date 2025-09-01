import java.util.Scanner;

public class Reverse_Number_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }

        sc.close();
    }
}
