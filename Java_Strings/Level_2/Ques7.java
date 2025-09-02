import java.util.Scanner;
public class Ques7 {
    public static int[] findStartEnd(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String subString(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] pos = findStartEnd(input);
        String trimmedManual = (pos[0] <= pos[1]) ? subString(input, pos[0], pos[1]) : "";
        String trimmedBuiltIn = input.trim();

        System.out.println("Manually Trimmed: '" + trimmedManual + "'");
        System.out.println("Built-in Trim:   '" + trimmedBuiltIn + "'");
        System.out.println("Both Match? " + compareStrings(trimmedManual, trimmedBuiltIn));
    }
}
