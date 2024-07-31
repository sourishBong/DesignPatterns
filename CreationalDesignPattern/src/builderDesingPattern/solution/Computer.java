package builderDesingPattern.solution;

public class Computer {

    private String CPU;
    private String RAM;
    private int capacityStorage;
    private String GPU;


    public Computer(String CPU, String RAM, int capacityStorage, String GPU) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.capacityStorage = capacityStorage;
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", capacityStorage=" + capacityStorage +
                ", GPU='" + GPU + '\'' +
                '}';
    }
}
