package decorator.design.pattern.after;

import decorator.design.pattern.after.Coffee;

//// Concrete Component
public class SimpleCoffee implements decorator.design.pattern.after.Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
