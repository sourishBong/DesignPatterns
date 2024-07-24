package factoryDesignPattern.solution;

public class LetterCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new Letter();
    }
}
