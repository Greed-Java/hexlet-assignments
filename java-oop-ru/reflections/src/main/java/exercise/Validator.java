package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// BEGIN
class Validator {
    public static List<String> validate(Address address) {
        List<String> notValidFields = new ArrayList<>();
        for (Field field : address.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                if (field.get(address) == null && field.isAnnotationPresent(NotNull.class)) {
                    notValidFields.add(String.valueOf(field)
                            .replace("private java.lang.String exercise.Address.", ""));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return notValidFields;
    }
}

// END
