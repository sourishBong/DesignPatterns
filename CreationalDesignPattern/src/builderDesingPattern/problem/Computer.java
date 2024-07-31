package builderDesingPattern.problem;


// while creating client we have to define each variable even if it is not required
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

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public int getCapacityStorage() {
        return capacityStorage;
    }

    public String getGPU() {
        return GPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setCapacityStorage(int capacityStorage) {
        this.capacityStorage = capacityStorage;
    }

    public void setGPU(String GPU) {
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
