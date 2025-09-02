package Level1;

import java.util.Scanner;

public class ques8 {
    public static int[] division(int a,int b){
        int Q = a / b;
        int R = a % b;
        int[] arr  = new int[2];
        arr[0] = Q;
        arr[1] = R;
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int result[]=division(a,b);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
