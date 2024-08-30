package visitor.pattern.before;

import java.util.ArrayList;
import java.util.List;

// Element interface
interface FileSystemElement {
    String getName();
}

// Concrete element: File
class File implements FileSystemElement {
    private String name;
    private int size; // size in bytes

    // Constructor, getters, and other methods

    @Override
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

// Concrete element: Directory
class Directory implements FileSystemElement {
    private String name;
    private List elements;

    // Constructor, getters, and other methods

    @Override
    public String getName() {
        return name;
    }

    public List getElements() {
        return elements;
    }
}

public class FileSystemProcessor {

    public static int calculateTotalSize(List<FileSystemElement> elements) {
        int totalSize = 0;

        for (FileSystemElement element : elements) {
            if (element instanceof File) {
                totalSize += ((File) element).getSize();
            } else if (element instanceof Directory) {
                totalSize += calculateTotalSize(((Directory) element).getElements());
            }
        }

        return totalSize;
    }

    public static void main(String[] args) {
        // Code to process the file system and calculate total size
        List<FileSystemElement> fileSystemElements = new ArrayList<>();
        // Populate the fileSystemElements
        int totalSize = calculateTotalSize(fileSystemElements);
        System.out.println("Total Size: " + totalSize + " bytes");
    }

}
