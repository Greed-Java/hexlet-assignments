package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (sentence.equals("")) {
            return map;
        }
        String[] sentenceList = sentence.split(" ");
        for (String word : sentenceList) {
            int newValue = map.getOrDefault(word, 0) + 1;
            map.put(word, newValue);
        }
        return map;
    }
    public static String toString(Map<String, Integer> m) {
        if (m.isEmpty()) return "{}";
        String result = "{";
        for (String elem : m.keySet()) {
            result = result + "\n  " + elem + ": " + m.get(elem);
        }
        result = result + "\n}";
        return result;
    }
}
//END
