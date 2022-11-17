package profilemodule.thirdhometask.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Class<?>> allInterfaces = GetAllInterfaces.getAllInterfaces(B.class);

        for (Class<?> someInterface : allInterfaces) {
            System.out.println(someInterface.getSimpleName());
        }
    }
}
