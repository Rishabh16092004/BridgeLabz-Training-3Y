import java.util.Scanner;
public class Ques4 {
    public static int findLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        int length = findLength(text), spaces = 0;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces + 1];
        int start = 0, idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start, length);
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

    public static int[] findShortestAndLongest(String[][] table) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < Integer.parseInt(table[minIdx][1])) minIdx = i;
            if (len > Integer.parseInt(table[maxIdx][1])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = customSplit(sc.nextLine());
        String[][] table = createWordLengthTable(words);
        int[] result = findShortestAndLongest(table);
        System.out.println("Shortest: " + table[result[0]][0] + " (Length " + table[result[0]][1] + ")");
        System.out.println("Longest: " + table[result[1]][0] + " (Length " + table[result[1]][1] + ")");
    }
}
