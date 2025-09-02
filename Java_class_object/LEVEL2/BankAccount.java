public class BankAccount {
    private String accountHolder;
    private String accountnumber;
    private double balance;

    BankAccount(String accountHolder, String accountnumber, double balance){
        this.accountHolder=accountHolder;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    public static void displayBank() {
        System.out.println("\t\t\t\tState of Chennai\t\t\t\t");

    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else {
            System.out.println("Amount to deposit must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdraw amount is : "+amount);
        }
        else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: "+balance);
    }

    public static void main(String args[]){
        BankAccount account = new BankAccount("Rishabh","123456789",700.00);
        displayBank();
        account.displayBalance();
        account.deposit(200);
        account.displayBalance();
        account.withdraw(100);
        account.displayBalance();
        account.withdraw(900);
    }

}
