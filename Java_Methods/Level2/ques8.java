package Level2;
import java.util.Scanner;
public class ques8 {
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngest = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest + " (Age: " + minAge + ")";
    }
    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        String tallest = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest + " (Height: " + maxHeight + " cm)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        String youngest = findYoungest(ages, friends);
        String tallest = findTallest(heights, friends);

        System.out.println("\nResults:");
        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);

        sc.close();
    }
}
