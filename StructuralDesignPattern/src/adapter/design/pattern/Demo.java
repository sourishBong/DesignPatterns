package adapter.design.pattern;

public class Demo {

    public static void main(String[] args) {

        IndianPlug indianPlug=new IndianPlug();

        Adapter adapterPlug=new Adapter(indianPlug);

        adapterPlug.americanPlugIn();
    }
}
