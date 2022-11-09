package profilemodule.secondhometask.task1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListOfIntegers = new ArrayList<>();

        arrayListOfIntegers.add(1);
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(3);
        arrayListOfIntegers.add(4);
        arrayListOfIntegers.add(5);
        arrayListOfIntegers.add(5);

        System.out.println(arrayListOfIntegers);
        System.out.println(returnUniqueElements(arrayListOfIntegers));

        ArrayList<String> arrayListOfStrings = new ArrayList<>();
        arrayListOfStrings.add("Ivan");
        arrayListOfStrings.add("Ivan");
        arrayListOfStrings.add("Anna");

        System.out.println(arrayListOfStrings);
        System.out.println(returnUniqueElements(arrayListOfStrings));
    }

    public static <T> HashSet<T> returnUniqueElements(ArrayList<T> arrayList) {
        return new HashSet<>(arrayList);
    }
}
