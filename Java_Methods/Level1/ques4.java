package Level1;

import java.util.Scanner;

public class ques4 {
    public static void checknumber(int n){
        if(n>0){
            System.out.println("positive number");
        }
        else if(n<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("zero number");
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=input.nextInt();
        checknumber(n);
    }
}
