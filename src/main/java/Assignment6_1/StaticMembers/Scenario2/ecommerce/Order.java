package Assignment6_1.StaticMembers.Scenario2.ecommerce;


public class Order {
    private static int totalOrdersPlaced = 0;

    private int orderId;
    private String customerName;
    private String product;

    public Order(String customerName, String product) {
        Order.totalOrdersPlaced++;
        this.orderId = totalOrdersPlaced;
        this.customerName = customerName;
        this.product = product;
        System.out.println("New Order created: ID " + this.orderId + " for " + this.customerName + " (" + this.product + ")");
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customerName + ", Product: " + product);
    }

    public static void displayTotalOrders() {
        System.out.println("Total Orders Placed: " + Order.totalOrdersPlaced);
    }
}
