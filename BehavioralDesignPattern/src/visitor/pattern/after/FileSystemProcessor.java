package visitor.pattern.after;

import java.util.ArrayList;
import java.util.List;

// Element interface
interface FileSystemElement {
    String getName();
    void accept(FileSystemVisitor visitor);
}

// Concrete element: File
class File implements FileSystemElement {
    // Implementation for files

    @Override
    public String getName() {
        // Return file name
        return "File";
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitFile(this);
    }

    public int getSize() {
        return 1;
    }
}

// Concrete element: Directory
class Directory implements FileSystemElement {
    // Implementation for directories

    @Override
    public String getName() {
        // Return directory name
        return "Directory";
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitDirectory(this);
    }

    public FileSystemElement[] getElements() {
        return new FileSystemElement[]{};
    }
}

// Visitor interface
interface FileSystemVisitor {
    void visitFile(File file);
    void visitDirectory(Directory directory);
    // Add methods for new operations without modifying existing classes
}

// Concrete visitor: SizeCalculatorVisitor
class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visitFile(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visitDirectory(Directory directory) {
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }
    // Getter for totalSize
    public int getTotalSize() {
        return 1;
    }


}

public class FileSystemProcessor {
    public static void main(String[] args) {
        // Code to process the file system using visitors
        List<FileSystemElement> fileSystemElements = new ArrayList<>();
        // Populate the fileSystemElements

        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        for (FileSystemElement element : fileSystemElements) {
            element.accept(sizeCalculatorVisitor);
        }

        int totalSize = sizeCalculatorVisitor.getTotalSize();
        System.out.println("Total Size: " + totalSize + " bytes");
    }
}
