package Assignment4.ProblemStatement1;

import Assignment4.ProblemStatement1.StripeGateway;
import Assignment4.ProblemStatement1.PayPalGateway;

public class PaymentGatewayTest {
    public static void main(String[] args) {
        StripeGateway stripe = new StripeGateway("sk_test_123", "https://api.stripe.com");
        stripe.connect();
        stripe.processPayment(500.00);
        stripe.processRefund(100.00);
        stripe.disconnect();

        System.out.println();

        PayPalGateway paypal = new PayPalGateway("paypal_client_id", "https://api.paypal.com");
        paypal.connect();
        paypal.processPayment(250.00);
        paypal.processRefund(50.00);
        paypal.disconnect();
    }
}
