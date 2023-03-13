package File;

import Base.Dragon;
import File.CollectionManager;
import File.FileRead;
import File.Parser;

import java.util.LinkedList;

public class Home {
    private final FileRead fileRead;

    public Home(FileRead fileRead) {
        this.fileRead = fileRead;
    }

    public void start(){

        String data = fileRead.readFile();
        LinkedList<Dragon> pars = new Parser().par(data);
        CollectionManager collection = new CollectionManager();
        collection.makeBase(pars);
        collection.show();
    }
}
