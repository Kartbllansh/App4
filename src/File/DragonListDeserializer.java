/*package File;

import Base.*;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.LinkedList;

public class DragonListDeserializer implements JsonDeserializer<LinkedList<Dragon>> {
    @Override
    public LinkedList<Dragon> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        LinkedList<Dragon> dragons = new LinkedList<>();
        if (json.isJsonArray()) {
            // Handle array of dragons
            JsonArray jsonArray = json.getAsJsonArray();
            for (JsonElement element : jsonArray) {
                JsonObject jsonObject = element.getAsJsonObject();
                Dragon dragon = deserializeDragon(jsonObject, context);
                dragons.add(dragon);
            }
        } else if (json.isJsonObject()) {
            // Handle single dragon
            JsonObject jsonObject = json.getAsJsonObject();
            Dragon dragon = deserializeDragon(jsonObject, context);
            dragons.add(dragon);
        }
        return dragons;
    }

    private Dragon deserializeDragon(JsonObject jsonObject, JsonDeserializationContext context) {
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
        return new Dragon(name, coordinates, age, weight, color, type, head);
    }
} */

