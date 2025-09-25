package exceptionhandling.ecommerce;

public class Checkout {

    /**
     * Calculates the total price of items.
     *
     * @param price The price per unit.
     * @param quantity The number of units.
     * @return The total calculated price.
     * @throws IllegalArgumentException if price or quantity is zero or negative.
     * @throws ArithmeticException if the calculation results in an overflow (simulated for very large values).
     */
    public double calculateTotal(double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Price and quantity must be positive values.");
        }
        if (price > Double.MAX_VALUE / quantity) {
            throw new ArithmeticException("Calculation overflow: Resulting total is too large.");
        }

        double total = price * quantity;
        System.out.printf("Calculating total for Price: $%.2f, Quantity: %d -> Total: $%.2f%n", price, quantity, total);
        return total;
    }
}
