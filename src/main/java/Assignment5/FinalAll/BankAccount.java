package Assignment5.FinalAll;

public class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + " into Account " + accountNumber + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from Account " + accountNumber + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds in Account " + accountNumber + " for withdrawal of $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    // Method to be overridden by subclasses
    public double calculateInterest() {
        System.out.println("Calculating generic interest for Account " + accountNumber);
        return 0.0;
    }
}
