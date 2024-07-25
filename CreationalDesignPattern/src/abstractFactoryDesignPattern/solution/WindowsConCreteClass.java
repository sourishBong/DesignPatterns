package abstractFactoryDesignPattern.solution;


//Creating concrete class for Window OS
public class WindowsConCreteClass implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
