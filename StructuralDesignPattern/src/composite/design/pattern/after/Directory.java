package composite.design.pattern.after;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{

    String name;
    List<FileSystemComponent> fileSystemComponents=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addFileComponent(FileSystemComponent component){
        fileSystemComponents.add(component);
    }

    @Override
    public void display() {
        System.out.println("Directory name:"+name);
        for(FileSystemComponent component:fileSystemComponents){
            component.display();
        }
    }
}
