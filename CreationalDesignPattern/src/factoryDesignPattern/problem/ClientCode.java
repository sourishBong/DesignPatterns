package factoryDesignPattern.problem;

public class ClientCode {

    public static void main(String[] args) {

        // Client code directly creates instances of Report
        Document report=new Report();
        report.generate();

        // Client code directly creates instances of Letter
        Document letter=new Letter();
        report.generate();
    }
}
