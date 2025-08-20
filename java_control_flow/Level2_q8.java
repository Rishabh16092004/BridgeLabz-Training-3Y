import java.util.Scanner;

public class Level2_q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        if(num>0){
            System.out.print("number is positive integer ");
            int count = 1;
            while(count<num){
                if(num%count==0){
                    System.out.print(count+" ");
                }
                count++;
            }
        }
    }
}
