package command.pattern.before;

// Light class
class Light {
    void turnOn() {
        System.out.println("Light is ON");
    }

    void turnOff() {
        System.out.println("Light is OFF");
    }
}

// RemoteControl class
class RemoteControl {
    Light light;

    RemoteControl(Light light) {
        this.light = light;
    }

    void pressButton() {
        // Assume a single button for simplicity
        light.turnOn();
    }
}

public class Main {

    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        RemoteControl livingRoomRemote = new RemoteControl(livingRoomLight);

        livingRoomRemote.pressButton();
    }
}
