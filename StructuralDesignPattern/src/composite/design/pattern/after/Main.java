package composite.design.pattern.after;

public class Main {

    public static void main(String[] args) {

        // Without Composite Pattern
//        File file1 = new File("file1.txt");
//        File file2 = new File("file2.txt");
//
//        Directory directory1 = new Directory("Folder 1");
//        directory1.addFileComponent(file1);
//        directory1.addFileComponent(file2);
//
//        directory1.display();

        // With Composite Pattern
        FileSystemComponent file3 = new File("file3.txt");
        FileSystemComponent file4 = new File("file4.txt");

        FileSystemComponent directory2 = new Directory("Folder 2");
        ((Directory) directory2).addFileComponent(file3);
        ((Directory) directory2).addFileComponent(file4);

        directory2.display();
    }
}
