import java.util.Scanner;

public class Level3_q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while(number>0){
            number = number/10;
            count++;
        }
        System.out.println("The number has "+count+" digits");
    }
}
