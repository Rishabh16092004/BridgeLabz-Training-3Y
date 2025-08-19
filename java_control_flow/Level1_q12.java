import java.util.Scanner;

public class Level1_q12 {
    public static void main(String args[]) {
        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int demo = num;
        while (num!=0) {
            sum = sum + num;
            num--;
        }
        System.out.println(sum);
        System.out.println(sum==(demo*(demo+1)/2));

    }
}
