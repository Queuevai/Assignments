package customexceptions.ecommerce;

public class OrderProcessingTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        System.out.println("--- E-commerce Order Processing ---");

        // Test Case 1: Valid order
        try {
            orderService.placeOrder("Laptop", 1);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 2: Invalid order (quantity zero)
        try {
            orderService.placeOrder("Phone", 0);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 3: Another valid order
        try {
            orderService.placeOrder("Headphones", 3);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 4: Invalid order (negative quantity)
        try {
            orderService.placeOrder("Mouse", -2);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
    }
}
