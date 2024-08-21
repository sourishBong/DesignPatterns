package facade.design.pattern.after;

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

// Facade Class
class ShoppingFacade {

    private InventorySystem inventorySystem;
    private OrderProcessingSystem orderProcessingSystem;
    private PaymentSystem paymentSystem;

    public ShoppingFacade() {
        this.inventorySystem = new InventorySystem();
        this.orderProcessingSystem = new OrderProcessingSystem();
        this.paymentSystem = new PaymentSystem();
    }

    // Simplified methods for the client
    public void purchaseProduct(String product, int quantity, double amount) {
        inventorySystem.updateInventory(product, quantity);
        orderProcessingSystem.placeOrder(product, quantity);
        paymentSystem.processPayment(product, quantity, amount);
    }

    // Additional simplified methods if needed

}

public class ShoppingCartClient {

    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        // Client interacts with the subsystems through the facade
        shoppingFacade.purchaseProduct("Laptop", 2, 2000.0);

        // Client doesn't need to know about the details of Inventory, Order Processing, and Payment
    }
}
