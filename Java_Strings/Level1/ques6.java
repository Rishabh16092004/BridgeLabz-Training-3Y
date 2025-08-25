import java.util.Scanner;

public class ques6 {
    public static void generateException(String text) {
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }
    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("⚠ Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("⚠ Caught RuntimeException: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String input = sc.nextLine();
        handleException(input);
    }
}
