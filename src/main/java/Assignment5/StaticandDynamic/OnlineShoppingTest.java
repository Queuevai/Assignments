package Assignment5.StaticandDynamic;


public class OnlineShoppingTest {
    public static void main(String[] args) {
        // --- Demonstrating Dynamic Polymorphism (Method Overriding) ---
        System.out.println("--- Dynamic Polymorphism (Overriding) ---");
        Customer customer1 = new RegularCustomer();
        Customer customer2 = new PremiumCustomer();

        double amount1 = 100.0;
        double amount2 = 200.0;

        System.out.println("Customer 1 (Regular) discount for $" + amount1 + ": $" + customer1.calculateDiscount(amount1)); // Calls RegularCustomer's overridden method
        System.out.println("Customer 2 (Premium) discount for $" + amount2 + ": $" + customer2.calculateDiscount(amount2)); // Calls PremiumCustomer's overridden method
        System.out.println();

        // --- Demonstrating Static Polymorphism (Method Overloading) ---
        System.out.println("--- Static Polymorphism (Overloading) ---");
        RegularCustomer rc = new RegularCustomer();
        PremiumCustomer pc = new PremiumCustomer();

        double amount3 = 300.0;
        int loyaltyPointsRC = 800;
        int loyaltyPointsPC = 700;

        // Overloaded method for RegularCustomer (inherited from Customer)
        System.out.println("Regular Customer discount for $" + amount3 + " with " + loyaltyPointsRC + " points: $" + rc.calculateDiscount(amount3, loyaltyPointsRC));

        // Overloaded method for PremiumCustomer (overridden in PremiumCustomer)
        System.out.println("Premium Customer discount for $" + amount3 + " with " + loyaltyPointsPC + " points: $" + pc.calculateDiscount(amount3, loyaltyPointsPC));

        System.out.println();

        // One more example for PremiumCustomer with lower loyalty points
        double amount4 = 150.0;
        int loyaltyPointsPC_low = 300;
        System.out.println("Premium Customer discount for $" + amount4 + " with " + loyaltyPointsPC_low + " points: $" + pc.calculateDiscount(amount4, loyaltyPointsPC_low));
    }
}
