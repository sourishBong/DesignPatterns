package bridge.design.pattern.after;

// Refined Abstraction
public class AdvancedRemoteControl extends BasicRemoteControl{

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}
