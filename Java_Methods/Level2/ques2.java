package Level2;

import java.util.Scanner;

public class ques2 {
    public static int recursivesum(int n){

        if(n==1) return 1;
        return n+recursivesum(n-1);
    }

    public static int formulasum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
        }
        else{
            int sumRecursive =  recursivesum(n);
            int sumFormula = formulasum(n);

            System.out.println("sum of first "+ n + " natural numbers using recursion: "+ sumRecursive);
            System.out.println("Sum of first "+n+" natural numbers using formula: "+ sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println("✅ Both results match. Computation is correct!");
            } else {
                System.out.println("❌ Results do not match. Something is wrong!");
            }
        }
    }
}
