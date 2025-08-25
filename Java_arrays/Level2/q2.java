package Level2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ": ");
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height (in cm): ");
            height[i] = sc.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + friends[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");
    }
}
