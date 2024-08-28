package mediator.pattern.after;

// Airplane class with mediator
class Airplane {
    private String callsign;
    private Mediator mediator;

    public Airplane(String callsign, Mediator mediator) {
        this.callsign = callsign;
        this.mediator = mediator;
    }

    public void sendMessage(String message, Airplane destination) {
        mediator.sendMessage(message, this, destination);
    }

    public void receiveMessage(String message) {
        System.out.println(callsign + " receives message: " + message);
        // Logic for handling received message
    }

    public String getCallsign() {
        return callsign;
    }
}

// Mediator interface
interface Mediator {
    void sendMessage(String message, Airplane sender, Airplane receiver);
}

// Concrete mediator class
class AirTrafficControlMediator implements Mediator {
    @Override
    public void sendMessage(String message, Airplane sender, Airplane receiver) {
        System.out.println(sender.getCallsign() + " sends message to " + receiver.getCallsign() + ": " + message);
        // Logic for handling the message and relaying it to the receiver
        receiver.receiveMessage(message);
    }
}

// Client code using mediator
public class AirTrafficControlSystem {

    public static void main(String[] args) {
        Mediator mediator = new AirTrafficControlMediator();

        Airplane airplane1 = new Airplane("Flight 123", mediator);
        Airplane airplane2 = new Airplane("Flight 456", mediator);

        airplane1.sendMessage("Avoiding turbulence, change course", airplane2);
    }
}
