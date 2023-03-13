package File;

import java.util.UUID;

public class RandomLongGenerator {

    public  static Long generId(){
        UUID uuid = UUID.randomUUID();
        long randomLong = uuid.getMostSignificantBits() & Long.MAX_VALUE;
        return randomLong;
    }
}
