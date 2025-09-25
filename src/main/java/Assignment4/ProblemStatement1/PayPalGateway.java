package Assignment4.ProblemStatement1;

import Assignment4.ProblemStatement1.RefundProcessor;

class PayPalGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public PayPalGateway(String apiKey, String connectionUrl) {
        super("PayPal", apiKey, connectionUrl);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal...");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of $" + amount + " via PayPal...");
    }
}

