package Assignment6_1.StaticMembers.Scenario2.ecommerce;


public class OrderTrackingTest {
    public static void main(String[] args) {
        System.out.println("--- Initial State ---");
        Order.displayTotalOrders();
        System.out.println();

        System.out.println("--- Creating Orders ---");
        Order order1 = new Order("Alice", "Laptop");
        Order order2 = new Order("Bob", "Mouse");
        Order order3 = new Order("Charlie", "Keyboard");
        System.out.println();

        System.out.println("--- Displaying Individual Order Details ---");
        order1.displayOrderDetails();
        order2.displayOrderDetails();
        order3.displayOrderDetails();
        System.out.println();

        System.out.println("--- Verifying Shared Counter ---");
        Order.displayTotalOrders(); // Correct way to call static method

        System.out.println("Total orders via order1 object reference (not recommended): ");
        order1.displayTotalOrders();
    }
}
