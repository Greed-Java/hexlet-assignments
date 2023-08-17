package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    
    public static boolean scrabble(String letters, String word) {
        String[] lettesrArray = letters.split("");
        ArrayList<String> array = new ArrayList<>();
        array.addAll(0, List.of(lettesrArray));
        String[] wordArray = word.toLowerCase().split("");
        for (String element : wordArray) {
            if (array.contains(element)) {
                array.remove(element);
            } else return false;
        }
        return true;
    }
}
//END
