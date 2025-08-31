import java.util.Scanner;

public class Grade_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Physics (out of 100): ");
        int physicsMarks = input.nextInt();

        System.out.print("Enter marks for Chemistry (out of 100): ");
        int chemistryMarks = input.nextInt();

        System.out.print("Enter marks for Maths (out of 100): ");
        int mathsMarks = input.nextInt();

        input.close();

        double averageMark = (physicsMarks + chemistryMarks + mathsMarks) / 3.0;

        char grade;
        String remarks;

        if (averageMark >= 80) {
            grade = 'A';
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (averageMark >= 70) {
            grade = 'B';
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (averageMark >= 60) {
            grade = 'C';
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (averageMark >= 50) {
            grade = 'D';
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (averageMark >= 40) {
            grade = 'E';
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = 'R';
            remarks = "(Remedial standards)";
        }
        System.out.println("\n--- Grade Report ---");
        System.out.printf("Average Mark: %.2f%%\n", averageMark);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        System.out.println("--------------------");
    }
}