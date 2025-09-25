package customexceptions.atm;

import java.util.Scanner;

public class ATMTest {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        String enteredPin;

        System.out.println("--- ATM PIN Validation ---");

        while (true) {
            System.out.print("Enter PIN (or 'exit' to quit): ");
            enteredPin = scanner.nextLine();

            if (enteredPin.equalsIgnoreCase("exit")) {
                System.out.println("Exiting ATM. Goodbye!");
                break;
            }

            try {
                atm.validatePin(enteredPin);
                System.out.println("Access Granted. Welcome!");
                break; // Exit loop on successful PIN entry
            } catch (InvalidPinException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
