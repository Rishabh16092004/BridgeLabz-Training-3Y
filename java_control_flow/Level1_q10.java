import java.util.Scanner;
public class Level1_q10 {
    public static void main(String[] args) {
        int num,total=0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if(num==0)
                break;
            else {
                total = total + num;
            }
        }
        System.out.println("Total sum is: "+total);
    }
}
