package File;

import Base.Dragon;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JsonParser {

    public LinkedList<Dragon> deSerialize(String sb) throws JsonSyntaxException, IllegalArgumentException { //метод обрабатывающий json

        Type type = new TypeToken<LinkedList<Dragon>>() { //
        }.getType();
        Gson g = new GsonBuilder().registerTypeAdapter(type, new Deserealizer()).create();//?????

        if ("".equals(sb)) {
            System.out.println("Check");
            return new LinkedList<>();
        }
        System.out.println(sb);

        return g.fromJson(sb, type);
        //System.out.println("jhjh");
        /*System.out.println(sb);
        LinkedList<Dragon> sos = g.fromJson(sb, type);
        LinkedList<Dragon> write = new LinkedList<>();
         for(Dragon dragon : sos){
             write.add(dragon);
         }
         return write; */
    }
}



