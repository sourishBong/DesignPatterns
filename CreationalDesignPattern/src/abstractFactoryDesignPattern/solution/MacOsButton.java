package abstractFactoryDesignPattern.solution;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac OS Button render");
    }
}
