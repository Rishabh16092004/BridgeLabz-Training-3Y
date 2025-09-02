import java.util.Scanner;

public class Level1_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println("The number is zero");
        }
        else if(num>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
