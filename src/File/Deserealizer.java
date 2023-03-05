package File;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.util.Map;

public class Deserealizer implements JsonDeserializer<java.time.ZonedDateTime> {
@Override
    public ZonedDateTime deserialize(JsonElement json, Type typeOft, JsonDeserializationContext context) {
Gson g = new Gson();
Type type = new TypeToken<Map<String, Integer>>() {
    }.getType();
Map<String, Integer> map = g.fromJson(json.toString(), type);
return java.time.ZonedDateTime.now();
}
}
