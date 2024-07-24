package factoryDesignPattern.solution;

public abstract class DocumentCreator {

    public abstract Document createDocument();

    //New method to process document
    public void generateDocument(){
        Document document=createDocument();

        document.generate();
    }
}
