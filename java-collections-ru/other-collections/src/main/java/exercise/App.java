package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        Set<String> allKeys = new TreeSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        for (String key : allKeys) {
            if (!map1.containsKey(key) & map2.containsKey(key)) {
                result.put(key, "added");
            } else if (map1.containsKey(key) & !map2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (map1.containsKey(key) & map2.containsKey(key) & !map1.get(key).equals(map2.get(key))) {
                result.put(key, "changed");
            } else if (map1.containsKey(key) & map2.containsKey(key) & map1.get(key).equals(map2.get(key))) {
                result.put(key, "unchanged");
            }


        }
        return result;
    }
}
//END
