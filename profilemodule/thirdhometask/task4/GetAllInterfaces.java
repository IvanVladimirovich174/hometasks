package profilemodule.thirdhometask.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllInterfaces {
    public static List<Class<?>> getAllInterfaces(Class<?> cls) {

        List<Class<?>> listOfInterfaces = new ArrayList<>();

        while (!cls.equals(Object.class)) {
            listOfInterfaces.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }

        return listOfInterfaces;
    }
}