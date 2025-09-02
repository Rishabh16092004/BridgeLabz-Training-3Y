import java.util.Scanner;

public class ques7 {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("⚠ Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("⚠ Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in string form: ");
        String input = sc.nextLine();
        handleException(input);
    }
}
