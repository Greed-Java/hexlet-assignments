package exercise;

import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {

        String result = Arrays.stream(config.split("\n"))
                .filter(s -> s.startsWith("environment="))
                .map(s -> s.replaceAll("environment=", ""))
                .map(s -> s.replaceAll("\"" , ""))
                .map(s -> s.split(","))
                .flatMap(Arrays::stream)
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.replaceAll("X_FORWARDED_", ""))
                .map(s -> s.trim())
                .collect(Collectors.joining(","));
    return result;
    }
}
//END
