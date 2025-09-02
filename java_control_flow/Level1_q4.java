import java.util.Scanner;

public class Level1_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num>0){
            int sum = num*(num+1)/2;
            System.out.println("The given number is a positive integer and their sum is "+sum);
        }
    }
}
