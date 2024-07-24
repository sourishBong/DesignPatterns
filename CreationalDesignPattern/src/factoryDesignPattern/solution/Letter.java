package factoryDesignPattern.solution;

public class Letter implements Document{

    @Override
    public void generate() {
        System.out.println("generate Letter");
    }
}
