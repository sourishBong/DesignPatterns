package builderDesingPattern.solution;

public interface Builder {

    Builder setCPU(String CPU);
    Builder setRAM(String RAM);
    Builder setStorageCapacity(int storageCapacity);
    Builder setGPU(String GPU);
}
