package File;

import Base.Dragon;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.LinkedList;

public class JsonParser {

    public LinkedList<Dragon>  deSerialize(String sb) throws JsonSyntaxException, IllegalArgumentException { //метод обрабатывающий json
        Gson g = new GsonBuilder().registerTypeAdapter(java.time.ZonedDateTime.class, new Deserealizer()).create();//?????
        Type type = new TypeToken<LinkedList<Dragon>>(){ //
        }.getType();
        if("".equals(sb)){
            System.out.println("Check");
            return new LinkedList<>();
        }
        return g.fromJson(sb, type);

    }

    }

