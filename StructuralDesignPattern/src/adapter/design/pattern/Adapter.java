package adapter.design.pattern;

public class Adapter implements AmericanPlug{

    private IndianPlug indianPlug;

    public Adapter(IndianPlug indianPlug) {
        this.indianPlug = indianPlug;
    }


    @Override
    public void americanPlugIn() {
        System.out.println("American plug plugged in");
        indianPlug.indianPlug();
    }
}
