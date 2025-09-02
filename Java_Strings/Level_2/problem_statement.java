import java.util.Scanner;
public class problem_statement {
    public static String correct(String paragraph){
        paragraph=paragraph.trim();
        paragraph = paragraph.replaceAll("\\s+"," ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < paragraph.length(); i++){
            char ch = paragraph.charAt(i);
            if(paragraph.charAt(i) == '.' || paragraph.charAt(i) == '?' || paragraph.charAt(i) == '!'){
                for(int j = i+1; j < paragraph.length(); j++){
                    char ch2 = paragraph.charAt(j);
                    sb.append(paragraph.charAt(i));
                    sb.append(" ");
                    break;
                }
            }
            else{
                sb.append(ch);
            }

        }
        return sb.toString();
    }
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write your paragragh :");
            String paragragh = sc.nextLine();
            System.out.print(correct(paragragh));
    }
}
