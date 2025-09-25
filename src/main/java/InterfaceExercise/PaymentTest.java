package InterfaceExercise;

public class PaymentTest {
    public static void main(String[] args) {
        // Create objects of the implementing classes
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();

        // Call their pay() methods
        payment1.pay(500);
        payment2.pay(200);
    }
}
