import java.util.Scanner;

public class Greatest_Factor_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("The number " + number + " has no greatest factor besides itself.");
        } else {
            int greatestFactor = 1;
            int counter = number - 1;

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
        sc.close();
    }
}