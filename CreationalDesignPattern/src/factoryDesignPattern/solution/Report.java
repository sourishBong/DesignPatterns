package factoryDesignPattern.solution;

public class Report implements Document{


    @Override
    public void generate() {
        System.out.println("Report");
    }
}
