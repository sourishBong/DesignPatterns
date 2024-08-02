package composite.design.pattern.after;

public class File implements FileSystemComponent{

    String name;

    public File(String name){
        this.name=name;
    }


    @Override
    public void display() {
        System.out.println("File name:"+name);
    }
}
