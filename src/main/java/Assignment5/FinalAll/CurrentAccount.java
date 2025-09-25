package Assignment5.FinalAll;


public class CurrentAccount extends BankAccount {
    private static final double CURRENT_INTEREST_RATE = 0.005;

    public CurrentAccount(int accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * CURRENT_INTEREST_RATE;
        System.out.printf("Calculating Current Account %d interest (%.2f%%): $%.2f%n", accountNumber, CURRENT_INTEREST_RATE * 100, interest);
        return interest;
    }
}
