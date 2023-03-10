import Base.Dragon;
import File.FileRead;
import File.JsonParser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //if(args.length == 0) {
            //System.out.println("Hello. I am waiting your file");
           // return;
        //}
        //FileRead fr = new FileRead(args[0]);

        FileRead fr = new FileRead("C:\\Users\\Home\\IdeaProjects\\App4/inform13.json");
        String data = fr.readFile();
        Gson gson = new Gson();
        Type dragonListType = new TypeToken<List<Dragon>>(){}.getType();
        List<Dragon> dragons = gson.fromJson(data, dragonListType);
        System.out.println(dragons);
        LinkedList<Dragon> string = new JsonParser().deSerialize(data);
        CollectionManager collection = new CollectionManager();
                collection.makeBase(string);
        System.out.println(string);
        collection.show();



    }

}