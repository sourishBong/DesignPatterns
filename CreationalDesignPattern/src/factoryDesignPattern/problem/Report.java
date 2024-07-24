package factoryDesignPattern.problem;

public class Report implements Document{


    @Override
    public void generate() {
        System.out.println("Generate Report");
    }
}
