package exceptionhandling.atm;


public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
        System.out.println("ATM initialized with balance: $" + this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance. Available: $" + balance);
        }

        balance -= amount;
        System.out.println("Successfully withdrew $" + amount + ". New balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}
