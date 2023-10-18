package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

// BEGIN
class App {

    public static void save(Path path, Car car) throws IOException {
        String result = car.serialize(car);
        Files.write(path, Collections.singleton(result), StandardCharsets.UTF_8);
    }


    public static Car extract(Path path) {
        Path path1 = path.toAbsolutePath().normalize();
        try {
            String strCar = Files.readString(path1);
            return Car.unserialize(strCar);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
// END
