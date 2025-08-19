import java.util.Scanner;

public class Level1_q14 {

    public static void main(String args[]) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=1) {
            fact = fact *num;
            num--;
        }
        System.out.println(fact);
    }
}
