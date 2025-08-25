package Level2;

import java.util.Scanner;

public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            double yrs = sc.nextDouble();
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Please re-enter details for Employee " + (i + 1));
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }
        for (int i = 0; i < EMP_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Company Totals (Zara) ---");
        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout = %.2f%n", totalBonus);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);
    }
}
