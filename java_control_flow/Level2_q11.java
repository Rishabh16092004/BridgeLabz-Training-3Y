import java.util.Scanner;

public class Level2_q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0 && num<=100){
            System.out.println("number is positive integer");
            for(int i=100;i>1;i--){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
