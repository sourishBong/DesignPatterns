package abstractFactoryDesignPattern.solution;

//windows implementation
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows Button");
    }
}
