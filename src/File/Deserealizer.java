package File;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Set;

public class Deserealizer implements JsonDeserializer<java.time.ZonedDateTime> {
@Override
    public ZonedDateTime deserialize(JsonElement json, Type typeOft, JsonDeserializationContext context) throws JsonParseException {
Gson g = new Gson();
Type type = new TypeToken<Map<String, Integer>>() {
    }.getType();
Map<String, Integer> map = g.fromJson(json.toString(), type);
    return ZonedDateTime.of(
            map.get("year"),
            map.get("month"),
            map.get("day"),
            map.get("hour"),
            map.get("minute"),
            map.get("second"),
            ZoneId.of(map.get("timezone"))
    );
}
}
