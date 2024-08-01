package bridge.design.pattern.after;

public class Main {

    public static void main(String[] args) {

        Device tv = new TV();
        Device radio = new Radio();

        BasicRemoteControl basicRemoteControl = new BasicRemoteControl(tv);
        basicRemoteControl.on();

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.mute();
    }
}
