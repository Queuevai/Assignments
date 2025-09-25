package exceptionhandling.atm;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMWithdrawalTest {
    public static void main(String[] args) {
        ATM myAtm = new ATM(10000.00); // Initialize ATM with $10,000

        Scanner scanner = new Scanner(System.in);
        String inputAmountStr;

        while (true) { // Loop to allow multiple withdrawal attempts
            System.out.print("\nEnter amount to withdraw (or 'exit' to quit): ");
            inputAmountStr = scanner.nextLine();

            if (inputAmountStr.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }

            try {
                double amount = Double.parseDouble(inputAmountStr);
                myAtm.withdraw(amount);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for the amount.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) { // Catch any other unexpected exceptions
                System.out.println("An unexpected error occurred: " + e.getMessage());
            } finally {
                System.out.println("Current account balance: $" + myAtm.getBalance());
            }
        }
        scanner.close();
    }
}
