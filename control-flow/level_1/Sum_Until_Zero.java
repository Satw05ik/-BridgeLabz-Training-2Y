import java.util.Scanner;

public class Sum_Until_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number;

        number = sc.nextDouble();

        while (number != 0) {
            total += number; 
            number = sc.nextDouble();
        }
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
