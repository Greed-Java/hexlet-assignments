package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> list) {

        return list.stream()
                .filter(map -> map.get("gender") == "male")
                .sorted((elem1, elem2) -> {
                    LocalDate date1 = LocalDate.parse(elem1.get("birthday"));
                    LocalDate date2 = LocalDate.parse(elem2.get("birthday"));
                    return date1.compareTo(date2);
                })
                .map(user -> user.get("name"))
                .collect(Collectors.toList());


    }
}
// END
