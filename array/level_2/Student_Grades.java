import java.util.Scanner;

public class Student_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");
                    mark = sc.nextInt();
                    if (mark < 0) System.out.println("Invalid! Enter positive value.");
                } while (mark < 0);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}
