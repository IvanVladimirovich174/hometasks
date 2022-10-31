package basicmodule.firsthometask.firstpart;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final double MILES_PER_KILOMETERS = 1.60934;

        Scanner scanner = new Scanner(System.in);
        double count = scanner.nextDouble();

        System.out.println(count / MILES_PER_KILOMETERS);
    }
}
