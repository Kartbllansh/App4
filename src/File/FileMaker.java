package File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.LinkedList;

public class FileMaker {

    public LinkedList<String>  deSerialize(String sb){
        Gson g = new GsonBuilder().registerTypeAdapter(java.time.ZonedDateTime.class, new Deserealizer() ) //Что в скобках?

    }


}
