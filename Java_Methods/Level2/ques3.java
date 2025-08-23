package Level2;
import java.util.Scanner;
public class ques3 {
    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if year is valid
        if (year < 1582) {
            System.out.println("❌ The program only works for year >= 1582 (Gregorian Calendar).");
        } else {
            // Check leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year ✅");
            } else {
                System.out.println(year + " is NOT a Leap Year ❌");
            }
        }
    }
}
