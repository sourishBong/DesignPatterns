package abstractFactoryDesignPattern.solution;

//Mac OS concrete class implements UIFactory
public class MacConcreteClass implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
