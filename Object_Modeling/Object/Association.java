package Object;

import java.util.ArrayList;

class Account{
    private String accountnumber;
    private double balance;

    public Account(String accountnumber,double balnace){
        this.accountnumber=accountnumber;
        this.balance=balnace;
    }
    public String getAccountNumber() {
        return accountnumber;
    }
    public double getBalnace() {
        return balance;
    }
    public void deposite(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class Customer{
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name){
        this.name=name;
        this.accounts=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void viewBalance(){
        for(Account account:accounts){
            System.out.println("Account: "+account.getAccountNumber() +" Balance: "+account.getBalnace());
        }
    }
}
class Bank{
    private String bankname;
    private ArrayList<Customer> customers;

    public Bank(String bankname){
        this.bankname=bankname;
        this.customers=new ArrayList<>();
    }

    public void openAccount(Customer customer,String accountnumber,double initialDeposite){
        Account newAccount=new Account(accountnumber,initialDeposite);
        customer.addAccount(newAccount);

        if(!customers.contains(customer)){
            customers.add(customer);
        }
        System.out.println("Account "+accountnumber+" opened for "+customer.getName()+" in "+bankname);
    }
    public void showCustomers(){
        for(Customer c:customers){
            System.out.println(" - "+c.getName() );
        }
    }
}
public class Association {
    public static void main(String[] args) {
        Bank bank=new Bank("State Bank");
        Customer c1=new Customer("Ravi");
        Customer c2=new Customer("Priya");

        bank.openAccount(c1,"ACC1001",5000);
        bank.openAccount(c1,"ACC1002",2000);

        bank.openAccount(c2,"ACC2001",10000);

        System.out.println(" Balance Details ");
        c1.viewBalance();
        c2.viewBalance();

        bank.showCustomers();
    }
}
