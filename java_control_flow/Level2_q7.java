import java.util.Scanner;

public class Level2_q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        if(num>0){
            System.out.println("number is positive integer");
            for(int i=1;i<num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
