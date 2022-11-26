package profilemodule.fourthhometask.task6;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class SetConverter {
    public static Set<Integer> convertSet(Set<Set<Integer>> setOfSet) {
        return setOfSet.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }
}