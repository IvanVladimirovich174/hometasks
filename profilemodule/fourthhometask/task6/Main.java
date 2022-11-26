package profilemodule.fourthhometask.task6;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Set<Integer>> setOfSets = Set.of(
                Set.of(1, 2, 3, 4, 5),
                Set.of(6, 7, 8, 9, 10),
                Set.of(11, 12, 13, 14, 15)
        );

        System.out.println(SetConverter.convertSet(setOfSets));
    }
}