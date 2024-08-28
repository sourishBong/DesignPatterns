package memento.pattern.before;

// Document class without using Memento pattern
class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

public class Client {

    public static void main(String[] args) {
        Document document = new Document("Initial content");

        // Save the initial state (but we don't have a proper mechanism to restore it later)
        String initialState = document.getContent();

        // Make changes to the document
        document.setContent("Updated content");

        // Attempt to undo by restoring the initial state
        document.setContent(initialState); // This is a manual and error-prone way

        System.out.println("Current Content: " + document.getContent());
    }
}
