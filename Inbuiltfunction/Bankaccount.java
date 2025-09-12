public class Bankaccount {
    private static String bankName="State bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public Bankaccount(String accountHolderName, String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts(){
        System.out.println("Total Accounts: "+totalAccounts);
    }

    public void displayAccountDetails(){
        if(this instanceof Bankaccount){
            System.out.println("Bank Name: "+bankName);
            System.out.println("Account Holder Name: "+accountHolderName);
            System.out.println("Account number: "+accountNumber);
            System.out.println("Balance:$ "+balance);
        }
        else{
            System.out.println("Invalid account instance.");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: $"+amount);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrawed: $"+amount);
        }
        else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public static void main(String args[]){
        Bankaccount account1 = new Bankaccount("Lynda Princy","ACC12345",1000);
        Bankaccount account2 = new Bankaccount("Prince Danish","ACC67890",500);
        System.out.println("\nAccount 1 Details");
        account1.displayAccountDetails();
        System.out.println("\nAccount 2 Details");
        account2.displayAccountDetails();
        Bankaccount.getTotalAccounts();
        System.out.println("Performing transactions on Account 1:");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account2.deposit(100);
        account2.withdraw(800);
    }
}
