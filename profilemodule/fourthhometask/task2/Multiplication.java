package profilemodule.fourthhometask.task2;

import java.util.List;

public class Multiplication {
    public static int getMultiplicationOfListValues(List<Integer> list) {
        return list.stream()
                .reduce((firstNumber, secondNumber) -> firstNumber * secondNumber)
                .orElse(0);
    }
}