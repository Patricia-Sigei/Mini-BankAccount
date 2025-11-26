public class BankAccount {
//    making them private as we do not want someone accessing them
    private String accountNumber;
    private String ownerName;
    private double balance;
// creating bank account
    public BankAccount(String accountNumber, String ownerName, double initialBalance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
//getting balance
    public double getBalance(){
        return balance;
    }
//depositing
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
//withdrawing
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }
}
