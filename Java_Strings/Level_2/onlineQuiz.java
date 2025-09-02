import java.util.Scanner;

public class onlineQuiz {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int grade = 0;
        String[] ans = {"A","B","C","A","D","B","B","C"};
        String[] userans = new String[ans.length];
        for(int i=0;i<ans.length;i++){
            int current = i+1;
            System.out.print("enter "+current+" answer: ");
            userans[i]=input.nextLine();
            if(userans[i].equalsIgnoreCase(ans[i])){
                grade++;
            }
        }
        System.out.println("Your total correct answer is : "+grade+ " "+ans.length);
    }
}
