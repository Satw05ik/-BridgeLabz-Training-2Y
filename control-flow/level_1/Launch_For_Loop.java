import java.util.Scanner;

public class Launch_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
        sc.close();
    }
}
