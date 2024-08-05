package decorator.design.pattern.before;

//client code
public class CoffeeShop {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Description: " + simpleCoffee.getDescription());
        System.out.println("Cost: $" + simpleCoffee.getCost());
    }
}
