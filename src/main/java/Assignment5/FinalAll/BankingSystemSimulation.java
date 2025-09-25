package Assignment5.FinalAll;


public class BankingSystemSimulation {
    public static void main(String[] args) {

        System.out.println("--- 1. Static Polymorphism (Method Overloading) ---");
        TransactionProcessor processor = new TransactionProcessor();
        processor.process(1001, 500.00); // Calls process(int, double)
        processor.process(1001, 1002, 200.00); // Calls process(int, int, double)
        System.out.println();

        System.out.println("--- 2. Dynamic Polymorphism (Method Overriding) ---");
        BankAccount savings = new SavingsAccount(2001, 1000.00);
        BankAccount current = new CurrentAccount(2002, 5000.00);

        savings.deposit(150.00);
        current.withdraw(750.00);

        System.out.println("Savings Account Balance: $" + savings.getBalance());
        System.out.println("Current Account Balance: $" + current.getBalance());

        // Calling overridden methods
        savings.calculateInterest(); // Calls SavingsAccount's calculateInterest
        current.calculateInterest(); // Calls CurrentAccount's calculateInterest
        System.out.println();

        System.out.println("--- 3. Interface Static & Default Methods ---");
        BankUser user = new BankUser("john.doe", "password123");

        // Calling interface static method directly
        SecurityCheck.logAttempt("admin");

        user.showSecurityStatus();

        user.verifyUser("john.doe", "password123"); // Successful login
        user.verifyUser("john.doe", "wrongpass");  // Failed login
        System.out.println();
    }
}
