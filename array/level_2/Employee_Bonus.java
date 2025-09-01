import java.util.Scanner;

public class Employee_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;

        System.out.println("Enter salary and years of service for " + EMPLOYEES + " employees:");

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double s = sc.nextDouble();

            System.out.print("Years of Service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please re-enter for this employee.");
                i--; 
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                               ", Bonus = " + bonus[i] +
                               ", New Salary = " + newSalary[i]);
        }

        System.out.println("\n--- Company Totals (Zara) ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
