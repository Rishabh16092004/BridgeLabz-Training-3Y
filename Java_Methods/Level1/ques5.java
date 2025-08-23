package Level1;

import java.util.Scanner;

public class ques5 {
    public static void springseason(int m,int d){
        if(m==3 && 20<=d && d<=31){
            System.out.println("Its a Spring Season");
        }
        else if(m==4 || m==5 && d>0 && d<=31){
            System.out.println("Its a Spring Season");
        }
        else if(m==6 && d>0 && d<=20){
            System.out.println("Its a Spring Season");
        }
        else {
            System.out.println("NOT a Spring Season");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month : ");
        int m=sc.nextInt();
        System.out.print("Enter day : ");
        int d=sc.nextInt();
        springseason(m,d);
    }
}
