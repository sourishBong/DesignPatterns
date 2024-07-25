package abstractFactoryDesignPattern.solution;

public class ClientCode {

    private static UIFactory uiFactory;
    public static void main(String[] args) {

// Create UI components using the Abstract Factory
        //String osName = System.getProperty("os.name").toLowerCase();
        String osName="Windows";

        if(osName.equalsIgnoreCase("MAC"))
            uiFactory=new MacConcreteClass();
        else if(osName.equalsIgnoreCase("WINDOWS"))
            uiFactory=new WindowsConCreteClass();
        else
            uiFactory=null;

        render();

    }

    public static void render(){
        Button button= uiFactory.createButton();
        Window window= uiFactory.createWindow();
        button.render();
        window.render();
    }
}
