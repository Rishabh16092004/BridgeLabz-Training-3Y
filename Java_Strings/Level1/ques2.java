import java.util.Scanner;
public class ques2 {
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String manualSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);
        boolean areEqual = compareStrings(manualSubstring, builtInSubstring);

        System.out.println("\nManual Substring (charAt): " + manualSubstring);
        System.out.println("Built-in Substring (substring()): " + builtInSubstring);

        if (areEqual) {
            System.out.println("✅ Both substrings are EQUAL");
        } else {
            System.out.println("❌ Substrings are DIFFERENT");
        }
    }
}
