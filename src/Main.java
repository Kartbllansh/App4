import Base.Dragon;
import File.FileRead;
import File.JsonParser;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        //if(args.length == 0) {
            //System.out.println("Hello. I am waiting your file");
           // return;
        //}
        //FileRead fr = new FileRead(args[0]);

        FileRead fr = new FileRead("C:\\Users\\Home\\IdeaProjects\\App4/inform13.json");
        String data = fr.readFile();

        LinkedList<Dragon> string = new JsonParser().deSerialize(data);
        CollectionManager collection = new CollectionManager();
                collection.makeBase(string);
        collection.show();



    }

}