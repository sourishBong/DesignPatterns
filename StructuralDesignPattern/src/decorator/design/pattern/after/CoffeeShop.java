package decorator.design.pattern.after;

public class CoffeeShop {

    public static void main(String[] args) {
        Coffee largeCoffeeWithFlavorAndTopping = new ToppingDecorator(
                new FlavorDecorator(
                        new SizeDecorator(new SimpleCoffee(), "large"),
                        "vanilla"),
                "whipped cream");

        System.out.println("Description: " + largeCoffeeWithFlavorAndTopping.getDescription());
        System.out.println("Cost: $" + largeCoffeeWithFlavorAndTopping.getCost());
    }
}
