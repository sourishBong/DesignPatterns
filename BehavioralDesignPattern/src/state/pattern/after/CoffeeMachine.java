package state.pattern.after;

// State interface
interface CoffeeMachineState {
    void performAction();
}

// Concrete state classes
class IdleState implements CoffeeMachineState {
    @Override
    public void performAction() {
        System.out.println("Preparing coffee...");
        // Additional logic for preparing coffee in the 'idle' state
        // Transition to the 'brewing' state if needed
        // context.setState(new BrewingState());
    }
}

class BrewingState implements CoffeeMachineState {
    @Override
    public void performAction() {
        System.out.println("Cannot perform action while brewing.");
        // Additional logic for handling actions in the 'brewing' state
    }
}

class FinishedState implements CoffeeMachineState {
    @Override
    public void performAction() {
        System.out.println("Coffee already prepared. Please reset.");
        // Additional logic for handling actions in the 'finished' state
    }
}

public class CoffeeMachine {

    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        // Initial state
        this.currentState = new IdleState();
    }

    public void setState(CoffeeMachineState newState) {
        this.currentState = newState;
    }

    public void performAction() {
        currentState.performAction();
    }
}
