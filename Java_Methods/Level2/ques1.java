package Level2;

import java.util.Scanner;

public class ques1 {
    public static int[] factors(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[] factors = new int[count];
        int index=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors[index++]=i;
            }
        }
        return factors;
    }
    public static int sumOfFactors(int[]  factors){
        int sum=0;
        for(int factor:factors){
            sum+=factor;
        }
        return sum;
    }
    public static long productOfFactors(int[]  factors){
        long product = 1;
        for(int factor:factors){
            product *= factor;
        }
        return product;
    }
    public static double sumOfSquare(int[]  factors){
        double sumsquare = 0;
        for(int factor:factors){
            sumsquare+=factor*factor;
        }
        return sumsquare;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] factors = factors(num);
        System.out.print("Factors of " + num + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquare(factors));
    }
}
