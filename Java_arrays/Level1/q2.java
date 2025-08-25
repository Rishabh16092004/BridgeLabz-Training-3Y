package Level1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                if(arr[i]%2==0){{
                System.out.println("Even number at index :"+i);
                }
                }
                else{
                    System.out.println("Odd number at index :"+i);
                }
            }
            else if(arr[i]<0){
                System.out.println("Negative number at index :"+i);
            }
            else{
                System.out.println("zero at index :"+i);
            }
        }
    }
}
