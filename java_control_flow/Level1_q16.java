import  java.util.Scanner;
public class Level1_q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Odd numbers: ");
        for(int i=1;i<=num;i=i+2) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        for(int i=2;i<=num;i=i+2) {
            System.out.print(i+" ");
        }
    }
}
