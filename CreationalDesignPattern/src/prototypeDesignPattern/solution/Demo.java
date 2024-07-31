package prototypeDesignPattern.solution;

public class Demo {

    public static void main(String[] args) {
        
        Shape c1=new Circle(10,"red");

        Shape c2=c1.clone();

        if(c1.equals(c2))
            System.out.println("Identical");
        else
            System.out.println("Not identical");
    }
}
