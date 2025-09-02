package Level1;

import java.util.Scanner;

public class ques2 {
    public static int possibleHandshake(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        int combinations = possibleHandshake(n);
        System.out.println("possible handshakes of "+n+" students "+combinations);
    }
}
