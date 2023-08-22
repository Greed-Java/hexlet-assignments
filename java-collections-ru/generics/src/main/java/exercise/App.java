package exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books,
                                                      Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book: books) {

            Set<String> valueSet= new HashSet<>(book.values());
            valueSet.addAll(book.keySet());
            Set<String> whereSet= new HashSet<>(where.values());
            whereSet.addAll(where.keySet());
            if (valueSet.containsAll(whereSet)) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
