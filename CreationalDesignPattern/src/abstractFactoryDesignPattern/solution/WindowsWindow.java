package abstractFactoryDesignPattern.solution;

public class WindowsWindow implements Window {
    @Override
    public void render() {
        System.out.println("Render Window's window");
    }
}
