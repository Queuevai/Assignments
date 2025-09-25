package Assignment5.FinalAll;


public class TransactionProcessor {

    public void process(int accountNumber, double amount) {
        System.out.println("Processing single transaction for Account " + accountNumber + ": $" + amount);
    }

    public void process(int fromAccount, int toAccount, double amount) {
        System.out.println("Processing transfer from Account " + fromAccount + " to Account " + toAccount + ": $" + amount);
    }
}
