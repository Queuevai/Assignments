package Assignment5.StaticandDynamic;

public class Customer {

    protected String customerType;

    public Customer(String customerType) {
        this.customerType = customerType;
    }

    public double calculateDiscount(double purchaseAmount) {
        System.out.println(customerType + " customer: Calculating basic discount for $" + purchaseAmount);
        return purchaseAmount * 0.05; // Default 5% discount
    }

    public double calculateDiscount(double purchaseAmount, int loyaltyPoints) {
        System.out.println(customerType + " customer: Calculating discount for $" + purchaseAmount + " with " + loyaltyPoints + " loyalty points");
        double discount = purchaseAmount * 0.05;
        if (loyaltyPoints > 1000) {
            discount += purchaseAmount * 0.02;
        }
        return discount;
    }
}

