import java.util.Scanner;
import java.util.Random;
public class Ques8 {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = 10 + rand.nextInt(90);
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Age\tCanVote");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVoting(ages);

        displayTable(result);
    }
}
