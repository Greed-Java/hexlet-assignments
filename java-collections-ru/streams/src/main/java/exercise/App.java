package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        long result = emails.stream()
                .filter(str -> str.endsWith("gmail.com") || str.endsWith("yandex.ru") || str.endsWith("hotmail.com"))
                .count();

        return result;
    }
}
// END
