package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage map) {
        Set<String> keySet = map.toMap().keySet();
        for (var key : keySet) {
            map.set(map.get(key, "def"), key);
            map.unset(key);
        }

    }
}
// END
