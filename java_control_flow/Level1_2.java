import java.util.Scanner;

public class Level1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("num1 is the smallest number among three");
        }
        else{
            System.out.println("num1 is not the smallest number among three");
        }
    }
}
