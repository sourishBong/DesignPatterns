package composite.design.pattern.before;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    String name;
    List<File> files=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addFile(File file){
        files.add(file);
    }

    public void displayDirectory(){
        System.out.println("Directory name"+name);
        for(File file:files){
            file.displayFile();
        }
    }
}
