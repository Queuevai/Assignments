package Assignment5.StaticandDynamic;

public class RegularCustomer extends Customer {

    public RegularCustomer() {
        super("Regular");
    }

    // Overriding the basic calculateDiscount method
    @Override
    public double calculateDiscount(double purchaseAmount) {
        System.out.println(customerType + " customer: Applying standard discount for $" + purchaseAmount);
        return purchaseAmount * 0.10; // Regular customers get 10% discount
    }

    // The overloaded method with loyaltyPoints is inherited as-is from Customer
    // If we wanted different logic for loyalty points for RegularCustomer, we'd override it here too.
}

