package profilemodule.fourthhometask.task1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int sumEvenNumbers = IntStream
                .range(0, 101)
                .filter(number -> number % 2 == 0)
                .sum();

        System.out.println(sumEvenNumbers);
    }
}