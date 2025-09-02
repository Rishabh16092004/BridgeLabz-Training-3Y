import java.util.Scanner;

public class Level2_q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0 && num<=100){
            int counter = num-1;
            while(counter>1){
                if(num%counter==0){
                    System.out.print(counter+" ");
                }
                counter--;
            }
        }
    }
}
