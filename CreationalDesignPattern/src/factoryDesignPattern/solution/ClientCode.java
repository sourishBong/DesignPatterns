package factoryDesignPattern.solution;

public class ClientCode {

    public static void main(String[] args) {

        DocumentCreator report=new ReportCreator();
        report.generateDocument();

        DocumentCreator letter=new LetterCreator();
        letter.generateDocument();
    }
}
