public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account1 = new BankAccount("ACC001", "Patricia", 1000.00);

        // Check initial balance
        System.out.println("Initial balance: $" + account1.getBalance());

        // Deposit money
        account1.deposit(500.00);

        // Check balance after deposit
        System.out.println("Balance after deposit: $" + account1.getBalance());

        // Withdraw money
        account1.withdraw(300.00);

        // Check final balance
        System.out.println("Final balance: $" + account1.getBalance());

        // Try to withdraw more than balance
        account1.withdraw(2000.00);
    }
}
