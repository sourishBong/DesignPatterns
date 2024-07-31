package builderDesingPattern.solution;

//Director class
public class Director {

    public void constructGampicPC(Builder builder){
        builder.setCPU("Intel i9");
        builder.setRAM("32GB RAM");
        builder.setStorageCapacity(512);
        builder.setGPU("NVIDIA RTX 3080");

    }

    public void constructNormalPC(Builder builder){
        builder.setCPU("Intel i9");
        builder.setRAM("64GB RAM");
        builder.setStorageCapacity(512);
    }
}
