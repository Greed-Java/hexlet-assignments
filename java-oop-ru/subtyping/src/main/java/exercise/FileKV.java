package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV implements KeyValueStorage {
    private String path;
    private Map<String, String> array;
    private Map<String, String> memoryArray;
    public FileKV(String path, Map<String, String> memoryArray) {
        this.path = path;
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
