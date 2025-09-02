package Level1;

import java.util.Scanner;

public class ProblemStatement1 {
    static Scanner scan = new Scanner(System.in);
    public static void deposite(long ac,int bal ){
        System.out.print("Enter depsite ammount :");
        int depoAmount = scan.nextInt();
        bal = bal + depoAmount;
        System.out.println("balace in account num ' "+ac+" ' is "+bal);
    }
    public static void withdraw(long ac,int bal){
        System.out.print("Enter withdraw ammount :");
        int withdrawAmount = scan.nextInt();
        int temp = bal;
        bal = bal - withdrawAmount;
        if(bal<0){
            System.out.println("Insufficient balace in account num ' "+ac+" ' is "+temp);
        }else{
            System.out.println("Remaining balace in account num ' "+ac+" ' is "+bal);
        }
    }
    public static void checkbalance(long ac,int bal){
        System.out.print("Total balace in account num ' "+ac+" ' is "+bal);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account number");
        long Ac =  scan.nextLong();
        System.out.println("Enter balance");
        int Bal = scan.nextInt();
        System.out.println("Enter 1 for deposite, 2 for withdraw, or 3 for checkbalance.");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                deposite(Ac,Bal);
                break;
            case 2:
                withdraw(Ac,Bal);
                break;
            case 3:
                checkbalance(Ac,Bal);
                break;
        }
    }
}
