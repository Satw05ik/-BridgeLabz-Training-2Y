import java.util.Scanner;

public class Largest_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        boolean firstLargest = number1 >= number2 && number1 >= number3;
        boolean secondLargest = number2 >= number1 && number2 >= number3;
        boolean thirdLargest = number3 >= number1 && number3 >= number2;

        System.out.println("Is the first number the largest? " + (firstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (secondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (thirdLargest ? "Yes" : "No"));
        sc.close();
    }
}
