package profilemodule.fourthhometask.task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringsToUpperCase {
    public static void stringsToUpperCaseAndPrintFirstMethod(List<String> listOfStrings) {
        String result = listOfStrings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    public static void stringsToUpperCaseAndPrintSecondMethod(List<String> listOfStrings) {
        IntStream.range(0, listOfStrings.size())
                .mapToObj(i -> listOfStrings.get(i).toUpperCase() + (i < listOfStrings.size() - 1 ? ", " : ""))
                .forEach(System.out::print);
    }
}