package Assignment5.FinalAll;


public class SavingsAccount extends BankAccount {
    private static final double SAVINGS_INTEREST_RATE = 0.02;

    public SavingsAccount(int accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * SAVINGS_INTEREST_RATE;
        System.out.printf("Calculating Savings Account %d interest (%.2f%%): $%.2f%n", accountNumber, SAVINGS_INTEREST_RATE * 100, interest);
        return interest;
    }
}

