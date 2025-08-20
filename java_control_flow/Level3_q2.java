import java.util.Scanner;

public class Level3_q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = scan.nextInt();
        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian calendar).");
        } else {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
    }
}
