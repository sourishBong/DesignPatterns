package memento.pattern.after;

import java.util.Stack;

// Originator class representing a document
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

    // This method creates a snapshot (Memento) of the current state
    public DocumentMemento createMemento() {
        return new DocumentMemento(content);
    }

    // This method restores the state from a Memento
    public void restoreFromMemento(DocumentMemento memento) {
        this.content = memento.getContentSnapshot();
    }
}

// Memento class representing a snapshot of the document state
class DocumentMemento {
    private final String contentSnapshot;

    public DocumentMemento(String content) {
        this.contentSnapshot = content;
    }

    public String getContentSnapshot() {
        return contentSnapshot;
    }
}

// Caretaker class responsible for managing multiple states of the document
class DocumentHistory {
    private Stack history = new Stack<>();

    public void saveState(DocumentMemento memento) {
        history.push(memento);
    }

    public DocumentMemento undo() {
        if (!history.isEmpty()) {
            return (DocumentMemento) history.pop();
        }
        return null;
    }
}

public class Client {

    public static void main(String[] args) {
        Document document = new Document("Initial content");
        DocumentHistory history = new DocumentHistory();

        // Save the initial state using Memento
        history.saveState(document.createMemento());
        System.out.println("Current Content: " + document.getContent());
        // Make changes to the document
        document.setContent("Updated content");

        // Save the updated state
        history.saveState(document.createMemento());

        // Undo by restoring the initial state using Memento
        DocumentMemento initialState = history.undo();
        if (initialState != null) {
            document.restoreFromMemento(initialState);
        }

        System.out.println("Current Content: " + document.getContent());
    }
}
