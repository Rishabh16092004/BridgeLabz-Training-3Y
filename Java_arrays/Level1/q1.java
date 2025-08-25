package Level1;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i]<18){
                System.out.println("Invalid age");
            }
            else{
                System.out.println("The student with the age " + arr[i]+" can vote.");
            }
        }
    }
}
