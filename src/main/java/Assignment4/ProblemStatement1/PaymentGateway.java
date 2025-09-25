package Assignment4.ProblemStatement1;

abstract class PaymentGateway {
    protected String gatewayName;
    protected String apiKey;
    protected String connectionUrl;

    public PaymentGateway(String gatewayName, String apiKey, String connectionUrl) {
        this.gatewayName = gatewayName;
        this.apiKey = apiKey;
        this.connectionUrl = connectionUrl;
    }

    public void connect() {
        System.out.println("Connected to " + gatewayName + " API");
    }

    public void disconnect() {
        System.out.println("Disconnected from " + gatewayName + " API");
    }
}

