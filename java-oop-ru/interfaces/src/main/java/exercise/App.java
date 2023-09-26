package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> listHome, int n) {
        List<String> result = listHome.stream()
                .sorted((x1, x2) -> x1.compareTo(x2))
                .map(x -> x.toString())
                .limit(n)
                .collect(Collectors.toList());
        return result;
    }
}
// END
