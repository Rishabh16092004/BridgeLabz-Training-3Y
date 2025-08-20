import java.util.Scanner;

public class Level3_q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        if(temp%sum==0){
            System.out.println("Harshad");
        }
        else{
            System.out.println("Not Harshad");
        }
    }
}
