package AfterComposition;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> directoryObjects;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        directoryObjects = new ArrayList<>();
    }
    public void add(FileSystem obj){
        directoryObjects.add(obj);
    }
    @Override
    public void ls() {

        System.out.println("directory name is "+directoryName);
        for(FileSystem obj:directoryObjects){
              obj.ls();
        }

    }
}
