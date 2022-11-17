package profilemodule.thirdhometask.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Constructor<APrinter> constructor = APrinter.class.getConstructor();
            APrinter aPrinter = constructor.newInstance();

            Method method = APrinter.class.getMethod("print", int.class);

            method.invoke(aPrinter, 1);
        } catch (InvocationTargetException | NoSuchMethodException |
                 InstantiationException | IllegalAccessException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}