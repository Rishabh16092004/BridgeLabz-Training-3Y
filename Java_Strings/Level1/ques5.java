import java.util.Scanner;

public class ques5 {
    public static void generateException(String text) {
        System.out.println("Character at index 100: " + text.charAt(100));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠ Caught Exception: " + e);
            System.out.println("Index out of range! String length is: " + text.length());
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();
        handleException(input);
    }
}
