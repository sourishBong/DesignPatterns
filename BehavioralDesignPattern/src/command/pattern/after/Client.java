package command.pattern.after;

interface Device {
    public void on();
    public void off();
}

// Lets create a new concrete device say
// Television which will implement all the
// methods of Device interface.
class TV implements Device {

    public void on() {
        System.out.println("TV is On");
    }

    public void off() {
        System.out.println("TV is Off");
    }
}

class Fan {

    public void on() {
        System.out.println("Fan is off");
    }

    public void off() {
        System.out.println("Fan is off");
    }
}

// This would be another concrete device
// other than Television
class Light implements Device {

    public void on() {
        System.out.println("Light is On");
    }

    public void off() {
        System.out.println("Light is Off");
    }
}

// Command interface
interface Command {
    void execute();
}

// ConcreteCommand classes
// TurnOn Command is the concrete implementation
// of Command interface also having a Device with it
// which is been set up by the constructor.
// its implemented execute method will call the
// turnOn Button on the remote control and will
// start the television or any other device.
class TurnOn implements Command {
    private final Device device;

    public TurnOn(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}

// Same as TurnOn Command
class TurnOff implements Command {
    private final Device device;

    public TurnOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}

// Invoker class
class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        // Assume a single button for simplicity
        command.execute();
    }
}

public class Client {

    public static void main(String[] args) {
        System.out.println("\nPlaying with Television .... ");
        // Create a Television object
        Device tv = new TV();

        // pass the device information to
        // TurnOn Command so that it invokes based on this television
        TurnOn turnOnCommand = new TurnOn(tv);

        // pass the command information to remotecontrol
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        // when we press the button based on turnOnCommand
        // television is made on
        remoteControl.pressButton();

        // Same is below for every other commands
        TurnOff turnOffCommand = new TurnOff(tv);
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

        System.out.println("\nPlaying with Light .... ");

        Device light = new Light();
        turnOnCommand = new TurnOn(light);
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();
    }
}
