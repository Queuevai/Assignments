package Assignment5.DynamicPolymorphism;

public class PaymentSystemTest {
    public static void main(String[] args) {
        CreditCardPayment ccPayment = new CreditCardPayment();
        UPIPayment ubiPayment = new UPIPayment();

        Payment payment1 = ccPayment;
        Payment payment2 = ubiPayment;

        System.out.println("--- Processing Payments ---");

        payment1.processPayment(150.75); // Will call CreditCardPayment's processPayment
        payment2.processPayment(50.00);  // Will call UPIPayment's processPayment
    }
}

