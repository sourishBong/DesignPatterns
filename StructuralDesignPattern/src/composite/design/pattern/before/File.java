package composite.design.pattern.before;

public class File {

    String name;

    public File(String name) {
        this.name = name;
    }

    public void displayFile(){
        System.out.println("File name is"+name);
    }
}
