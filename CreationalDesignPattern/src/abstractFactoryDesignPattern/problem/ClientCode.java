package abstractFactoryDesignPattern.problem;

public class ClientCode {

    public static void main(String[] args) {

        //exposing the concrete classes to client
        Button windowButon=new WindowsButton();
        Window windowWindow=new WindowsWindow();

        windowButon.render();
        windowWindow.render();

        Button macButton=new MacOsButton();
        Window macWindow=new MacOsWindow();

        macButton.render();
        macWindow.render();

    }
}
