package profilemodule.fourthhometask.task3;

import java.util.List;

public class CountNotEmptyStrings {
    public static int getCountOfNotEmptyStrings(List<String> strings) {
        return (int) strings.stream()
                .filter(string -> !string.isEmpty())
                .count();
    }
}