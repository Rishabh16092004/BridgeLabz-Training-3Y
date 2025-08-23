package Level2;
import java.util.Scanner;
public class ques7 {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " → Invalid Age (Cannot Vote)");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") → Eligible to Vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") → Not Eligible to Vote ❌");
            }
        }

    }
}
