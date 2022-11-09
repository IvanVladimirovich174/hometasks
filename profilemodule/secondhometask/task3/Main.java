package profilemodule.secondhometask.task3;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(0, 1, 2, 4);

        System.out.println(PowerfulSet.intersection(set1, set2));
        System.out.println(PowerfulSet.union(set1, set2));
        System.out.println(PowerfulSet.relativeComplement(set1, set2));
    }
}
