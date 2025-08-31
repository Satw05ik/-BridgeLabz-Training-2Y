import java.util.Scanner;

public class Digit_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int count = 0;
        int originalNumber = number;

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
        sc.close();
    }
}
