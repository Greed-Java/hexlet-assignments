package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements KeyValueStorage {
    private Map<String, String> memoryArray;
    Map<String, String> array = new HashMap<>();

    public InMemoryKV(Map<String, String> memoryArray) {
        this.memoryArray = memoryArray;
        array.putAll(memoryArray);
    }

    @Override
    public void set(String key, String value) {
        array.put(key, value);
    }

    @Override
    public void unset(String key) {
        array.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return array.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> temp = new HashMap<>();
        temp.putAll(array);
        return temp;
    }
}
// END
