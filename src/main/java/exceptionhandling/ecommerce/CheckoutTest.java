package exceptionhandling.ecommerce;

import java.util.Scanner;

public class CheckoutTest {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- E-Commerce Checkout System ---");

        // Loop to allow multiple checkout attempts
        while (true) {
            String priceStr = "";
            String quantityStr = "";

            try {
                System.out.print("Enter item price (or 'exit' to quit): ");
                priceStr = scanner.nextLine();
                if (priceStr.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter item quantity: ");
                quantityStr = scanner.nextLine();

                double price = Double.parseDouble(priceStr);
                int quantity = Integer.parseInt(quantityStr);

                double total = checkout.calculateTotal(price, quantity);
                System.out.printf("Order Total: $%.2f%n", total);

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format. Please enter valid numeric values for price and quantity.");
                System.out.println("Details: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Invalid input. " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Error: Calculation problem. " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            } finally {
                System.out.println("Checkout process complete for this attempt.");
                System.out.println("------------------------------------");
            }
        }
        scanner.close();
        System.out.println("Exiting E-Commerce Checkout System.");
    }
}
