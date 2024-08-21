package facade.design.pattern.before;

// Subsystem Components
class InventorySystem {
    public void updateInventory(String product, int quantity) {
        // Update inventory logic
    }
}

class OrderProcessingSystem {
    public void placeOrder(String product, int quantity) {
        // Place order logic
    }
}

class PaymentSystem {
    public void processPayment(String product, int quantity, double amount) {
        // Process payment logic
    }
}

//Client without facade
public class ShoppingCartClient {

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        OrderProcessingSystem orderProcessingSystem = new OrderProcessingSystem();
        PaymentSystem paymentSystem = new PaymentSystem();

        // Complex logic involving Inventory, Order Processing, and Payment
        inventorySystem.updateInventory("Laptop", 2);
        orderProcessingSystem.placeOrder("Laptop", 2);
        paymentSystem.processPayment("Laptop", 2, 2000.0);

        // More complex logic...
    }
}
