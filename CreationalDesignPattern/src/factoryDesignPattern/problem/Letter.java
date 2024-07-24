package factoryDesignPattern.problem;

public class Letter implements Document{


    @Override
    public void generate() {
        System.out.println("Generate Letter");
    }
}
