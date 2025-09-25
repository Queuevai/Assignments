package customexceptions.ecommerce;


public class OrderService {

    /**
     * Places an order for a given product and quantity.
     *
     * @param productName The name of the product.
     * @param quantity The quantity of the product to order.
     * @throws InvalidOrderQuantityException if the quantity is zero or less.
     */
    public void placeOrder(String productName, int quantity) {
        System.out.print("Placing order for " + productName + " (Quantity: " + quantity + ")... ");

        if (quantity <= 0) {
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero.");
        }

        // Simulate actual order placement
        System.out.println("Order placed successfully.");
        // Logic to update inventory, process payment, etc.
    }
}
