package bridge.design.pattern.before;

// Concrete Implementations
public class RaioRemoteControl implements RemoteControl{


    @Override
    public void turnOff() {
        System.out.println("Radio turn off");
    }

    @Override
    public void turnOn() {
        System.out.println("Raio turn on");
    }

    @Override
    public void changeChannel() {
        System.out.println("Change Channel");
    }
}
