package strategy.pattern.before;

// Payment processing class with a specific payment method
class PaymentProcessor {
    public void processPayment(double amount) {
        // Specific implementation for credit card payment
        // ...
        System.out.println("Processing credit card payment of $" + amount);
    }
}

public class Client {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(100.0);
        // Continue with other operations
    }

}
