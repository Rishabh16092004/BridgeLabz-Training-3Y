import java.util.Scanner;
public class ques1 {
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
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        boolean manualCompare = compareStrings(str1, str2);
        boolean builtInCompare = str1.equals(str2);
        System.out.println("\nManual comparison using charAt(): " + manualCompare);
        System.out.println("Built-in equals() method: " + builtInCompare);
        if (manualCompare == builtInCompare) {
            System.out.println("✅ Both methods give the SAME result.");
        } else {
            System.out.println("❌ The methods give DIFFERENT results.");
        }
    }
}
