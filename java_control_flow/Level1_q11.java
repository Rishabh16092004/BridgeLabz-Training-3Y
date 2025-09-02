import java.util.Scanner;
public class Level1_q11 {
    public static void main(String[] args) {
        int num,total=0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            if(num<=0) {
                break;
            }
            else {
                total = total + num;
            }
        }
        System.out.println("Total sum is: "+ total);
    }
}
