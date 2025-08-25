package Level2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            int digit = (int)(number % 10);
            if (index == maxDigit) {
                maxDigit += 10; // increase capacity by 10
                int[] temp = new int[maxDigit];

                // Copy old data into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // assign new array
            }
            digits[index] = digit;
            index++;
            number = number / 10;
        }

        if (index == 0) {
            System.out.println("No digits found!");
            return;
        }
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int current = digits[i];
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }
        System.out.println("Largest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (all digits same).");
        }

    }
}
