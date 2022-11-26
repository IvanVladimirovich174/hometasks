package profilemodule.fourthhometask.task4;

import java.util.Comparator;
import java.util.List;

public class DescendingSort {
    public static List<Double> descendingSort (List<Double> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}