import java.util.Scanner;

public class Friends_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        double heightAmar = sc.nextDouble();

        int ageAkbar = sc.nextInt();
        double heightAkbar = sc.nextDouble();

        int ageAnthony = sc.nextInt();
        double heightAnthony = sc.nextDouble();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Anthony is the youngest.");
        } else {
            System.out.println("Two or more friends have the same youngest age.");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Anthony is the tallest.");
        } else {
            System.out.println("Two or more friends have the same tallest height.");
        }
        sc.close();
    }
}
