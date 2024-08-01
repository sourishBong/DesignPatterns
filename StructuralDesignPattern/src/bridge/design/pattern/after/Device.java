package bridge.design.pattern.after;

// Implementor Interface
public interface Device {

    void turnOn();
    void turnOff();
    void changeChannel();
    void setVolume(int volume);
}
