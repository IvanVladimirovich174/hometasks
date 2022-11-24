package profilemodule.thirdhometask.task4;

import java.util.*;

public class GetAllInterfaces {
    public static Set<Class<?>> getAllInterfaces(Class<?> cls) {

        Set<Class<?>> result = new LinkedHashSet<>();

        while (!cls.equals(Object.class)) {
            addInterfacesToResult(cls.getInterfaces(), result);
            cls = cls.getSuperclass();
        }

        return result;
    }

    private static void addInterfacesToResult(Class<?>[] interfaces, Set<Class<?>> result) {
        if (interfaces.length != 0) {
            for (Class<?> anInterface : interfaces) {
                result.add(anInterface);
                addInterfacesToResult(anInterface.getInterfaces(), result);
            }
        }
    }
}