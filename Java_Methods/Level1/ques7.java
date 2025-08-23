package Level1;

import java.util.Scanner;

public class ques7 {
    public static void largest(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a+" is largest");
            if(b>c){
                System.out.println(c+" is smallest");
            }
            else {
                System.out.println(b+" is smallest");
            }
        }
        else if(b>a && b>c){
            System.out.println(b+" is largest");
            if(a>c){
                System.out.println(c+" is smallest");
            }
            else {
                System.out.println(a+" is smallest");
            }
        }
        else{
            System.out.println(c+" is largest");
            if(a>b){
                System.out.println(b+" is smallest");
            }
            else {
                System.out.println(a+" is smallest");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a=sc.nextInt();
        System.out.println("enter the second number : ");
        int b=sc.nextInt();
        System.out.println("enter the third number : ");
        int c=sc.nextInt();
        largest(a,b,c);


    }
}
