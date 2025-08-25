import java.util.Scanner;

public class Ques3 {
    public static int findLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        int length = findLength(text), spaceCount = 0;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') spaceCount++;
        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, length);
        return words;
    }

    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = customSplit(sc.nextLine());
        String[][] table = createWordLengthTable(words);
        System.out.println("Word\tLength\n-----------------");
        for (String[] row : table) System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
