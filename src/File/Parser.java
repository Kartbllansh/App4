package File;

import Base.Dragon;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedList;

public class Parser {
    public LinkedList<Dragon> par(String sb){
    Gson g = new Gson();
    Dragon[] dragons = g.fromJson(sb, Dragon[].class);

    LinkedList<Dragon> dr = new LinkedList<>();
        Collections.addAll(dr, dragons);
        Validate validate = new Validate();
        validate.startValide(dr);
    return dr;
    }
}
