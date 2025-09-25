package Assignment5.StaticandDynamic;

public class PremiumCustomer extends Customer {

    public PremiumCustomer() {
        super("Premium");
    }

    // Overriding the basic calculateDiscount method
    @Override
    public double calculateDiscount(double purchaseAmount) {
        System.out.println(customerType + " customer: Applying premium discount for $" + purchaseAmount);
        return purchaseAmount * 0.15; // Premium customers get 15% discount
    }

    // Overriding the overloaded method with loyaltyPoints for premium customers
    @Override
    public double calculateDiscount(double purchaseAmount, int loyaltyPoints) {
        System.out.println(customerType + " customer: Applying premium discount for $" + purchaseAmount + " with " + loyaltyPoints + " loyalty points");
        double discount = purchaseAmount * 0.15; // Base 15% discount
        if (loyaltyPoints > 500) { // Lower threshold for premium customers
            discount += purchaseAmount * 0.05; // Additional 5% for high loyalty
        }
        return discount;
    }
}

