import java.util.Scanner;

public class Ques2 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int wordStart = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(wordStart, i);
                wordStart = i + 1;
                wordIndex++;
            }
        }
        words[wordIndex] = text.substring(wordStart, length);
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a text: ");
            String input = sc.nextLine();
            String[] builtInResult = input.split(" ");
            String[] customResult = customSplit(input);
            boolean isSame = compareArrays(builtInResult, customResult);
            System.out.println("\nCustom Split Result:");
            for (int i = 0; i < customResult.length; i++) {
                System.out.println("Word " + (i + 1) + ": " + customResult[i]);
            }
            System.out.println("\nBuilt-in Split Result:");
            for (int i = 0; i < builtInResult.length; i++) {
                System.out.println("Word " + (i + 1) + ": " + builtInResult[i]);
            }
            System.out.println("\nComparison result: " + isSame);
    }
}
