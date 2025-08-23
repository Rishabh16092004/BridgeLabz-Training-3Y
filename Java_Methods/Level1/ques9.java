package Level1;

import java.util.Scanner;

public class ques9 {
    public static int[] division(int a,int b){
        int Q = b / a;
        int R = b % a;
        int[] arr  = new int[2];
        arr[0] = Q;
        arr[1] = R;
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of chocolates: ");
        int numberOfchocolates =sc.nextInt();
        System.out.print("enter the number of children: ");
        int numberOfchildren =sc.nextInt();
        int result[]=division(numberOfchildren,numberOfchocolates);
        System.out.println("chocolates each child gets : "+result[0]);
        System.out.println("number of chocolates remaining : "+result[1]);
    }
}
