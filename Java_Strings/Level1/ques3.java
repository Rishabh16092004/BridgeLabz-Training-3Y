import java.util.Scanner;
public class ques3 {
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void displayCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();
        System.out.print("\nCustom char array: ");
        displayCharArray(customArray);

        System.out.print("Built-in char array: ");
        displayCharArray(builtInArray);
        boolean areEqual = compareCharArrays(customArray, builtInArray);

        if (areEqual) {
            System.out.println("\n✅ Both arrays are EQUAL");
        } else {
            System.out.println("\n❌ Arrays are DIFFERENT");
        }

        sc.close();
    }
}
