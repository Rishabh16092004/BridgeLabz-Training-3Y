package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            if(arr[i]<18){
//                System.out.println("Invalid age");
//            }
//            else{
//                System.out.println("The student with the age " + arr[i]+" can vote.");
//            }
//        }
          int[] arr = {3,5,2,6,5};
          int[] arr2 = Arrays.copyOf(arr,arr.length);
          Arrays.sort(arr);
          System.out.println("sorted array:"+Arrays.toString(arr));
          System.out.println(Arrays.toString(arr2));
          System.out.println(Arrays.binarySearch(arr,2));
          System.out.println(Arrays.equals(arr,arr2));
          Arrays.fill(arr,16);
          System.out.println(Arrays.toString(arr));


    }
}
