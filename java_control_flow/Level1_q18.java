import java.util.Scanner;

public class Level1_q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=6;i<=9;i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
