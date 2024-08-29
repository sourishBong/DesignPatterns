package strategy.pattern.after;

// Strategy interface
interface PaymentStrategy {
    void processPayment(double amount);
}

// Concrete strategy: CreditCardPayment
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implementation of credit card payment
        // ...
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Concrete strategy: PayPalPayment
class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implementation of PayPal payment
        // ...
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Concrete strategy: BitcoinPayment
class BitcoinPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Implementation of Bitcoin payment
        // ...
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

// Context class that uses the strategy
class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}

public class Client {

    public static void main(String[] args) {
// Using CreditCardPayment strategy
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        paymentProcessor.processPayment(100.0);

        // Switching to PayPalPayment strategy dynamically
        paymentProcessor.setPaymentStrategy(new PayPalPayment());
        paymentProcessor.processPayment(50.0);

        // Switching to BitcoinPayment strategy dynamically
        paymentProcessor.setPaymentStrategy(new BitcoinPayment());
        paymentProcessor.processPayment(200.0);

        // Continue with other operations
    }
}
