package File;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Deserealizer implements JsonDeserializer<java.time.ZonedDateTime> {
@Override
    public ZonedDateTime deserialize(JsonElement json, Type typeOft, JsonDeserializationContext context) throws JsonParseException {
    return ZonedDateTime.parse(json.getAsString(), DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss").withLocale(Locale.ENGLISH));
}
}
