package prototypeDesignPattern.solution;

public class Circle implements Shape{

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters...
    
    @Override
    public Shape clone() {
        return new Circle(this.radius,this.color);
    }
}
