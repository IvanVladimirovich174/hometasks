package profilemodule.thirdhometask.task4;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Class<?>> allInterfaces = GetAllInterfaces.getAllInterfaces(B.class);

        for (Class<?> anInterface : allInterfaces) {
            System.out.println(anInterface.getSimpleName());
        }
    }
}