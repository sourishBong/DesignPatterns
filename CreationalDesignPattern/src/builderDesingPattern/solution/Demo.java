package builderDesingPattern.solution;

public class Demo {

    public static void main(String[] args) {

        Director director=new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        ComputerBuilder builder=new ComputerBuilder();
        director.constructGampicPC(builder);

        Computer computer=builder.build();

        System.out.println(computer.toString());

        ComputerBuilder builder2=new ComputerBuilder();
        director.constructNormalPC(builder2);

        Computer computer2=builder2.build();
        System.out.println(computer2.toString());
    }
}
