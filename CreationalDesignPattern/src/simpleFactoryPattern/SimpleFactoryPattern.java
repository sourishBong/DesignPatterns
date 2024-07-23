package simpleFactoryPattern;

public class SimpleFactoryPattern {

    public static void main(String[] args) {

        //This is a concrete implementation like Rectangle,Square,Circle
        /*Shape square=new Square();
        square.draw();

        Shape rectangle=new Rectangle();
        rectangle.draw();

        Shape circle=new Circle();
        circle.draw();*/

        ShapeFactory shape=new ShapeFactory();

        Shape square=shape.shapeFactory("Square");
        square.draw();

        Shape rectangle=shape.shapeFactory("Rectangle");
        rectangle.draw();

        Shape circle=shape.shapeFactory("Circle");
        circle.draw();
    }
}
