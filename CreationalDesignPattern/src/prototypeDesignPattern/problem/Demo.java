package prototypeDesignPattern.problem;

public class Demo {

    public static void main(String[] args) {

        Circle c1=new Circle(5,"red");

        Circle c2=c1.clone();

        //Problem here is we need to be aware of class name thus making code dependent on classes.
        if(c1.equals(c2)){
            System.out.println("Identical object");
        }else
            System.out.println("Not identical");


    }
}
