package bridge.design.pattern.before;

// Concrete Implementations
public class TVRemoteControl implements RemoteControl{


    @Override
    public void turnOff() {
        System.out.println("TV Turn off");
    }

    @Override
    public void turnOn() {
        System.out.println("TV Turn on");
    }

    @Override
    public void changeChannel() {
        System.out.println("Change Channel");
    }
}
