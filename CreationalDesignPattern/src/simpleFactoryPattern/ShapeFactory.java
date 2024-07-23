package simpleFactoryPattern;

//Simple Factory
public class ShapeFactory {

    public Shape shapeFactory(String shape){
        if("Circle".equalsIgnoreCase(shape))
            return new Circle();
        else if("Rectangle".equalsIgnoreCase(shape))
            return new Rectangle();
        else if("Square".equalsIgnoreCase(shape))
            return new Square();

        //to handle other unknown scenario
        return null;
    }
}
