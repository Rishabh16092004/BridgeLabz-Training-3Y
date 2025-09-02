import java.util.Scanner;

public class Level2_q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int pow = scan.nextInt();
        if(num>0 && pow>0){
            int counter = 0;
            int result = 1;
            while(counter!=pow){
                result = result*num;
                counter++;
            }

            System.out.println(result);
        }
    }
}
