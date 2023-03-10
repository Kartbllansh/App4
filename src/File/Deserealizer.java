package File;

import Base.*;
import Base.Coordinates;
import Base.Dragon;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Deserealizer implements JsonDeserializer<LinkedList<Dragon>> {

    @Override
    public LinkedList<Dragon> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        LinkedList<Dragon> dragons = new LinkedList<>();
        JsonArray jsonArray = json.getAsJsonArray();
        for (JsonElement element : jsonArray) {
            JsonObject jsonObject = element.getAsJsonObject().getAsJsonObject("Dragon");
            String name = jsonObject.get("name").getAsString();
            Coordinates coordinates = context.deserialize(jsonObject.get("coordinates"), Coordinates.class);
            Integer age = null;
            if (jsonObject.has("age")) {
                age = jsonObject.get("age").getAsInt();
            }
            Long weight = jsonObject.get("weight").getAsLong();
            Color color = Color.valueOf(jsonObject.get("color").getAsString());
            DragonType type = DragonType.valueOf(jsonObject.get("type").getAsString());
            DragonHead head = null;
            if (jsonObject.has("head")) {
                head = context.deserialize(jsonObject.get("head"), DragonHead.class);
            }
            dragons.add(new Dragon(name, coordinates, age, weight, color, type, head));
        }
        return dragons;
    }
}
