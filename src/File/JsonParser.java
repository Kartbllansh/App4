package File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.LinkedList;

public class JsonParser {

    public LinkedList<String>  deSerialize(String sb) throws JsonSyntaxException, IllegalArgumentException {
        Gson g = new GsonBuilder().registerTypeAdapter(java.time.ZonedDateTime.class, new Deserealizer()).create();//Что в скобках?
        Type type = new TypeToken<LinkedList<String>>(){
        }.getType();
        if("".equals(sb)){
            return new LinkedList<>();
        }
        return g.fromJson(sb, type);

    }

    }

