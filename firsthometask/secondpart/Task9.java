package firsthometask.secondpart;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        final double EPSILON = 1E-14;

        boolean isTrue = Math.abs(Math.pow(Math.sin(x), 2.0) + Math.pow(Math.cos(x), 2.0) - 1.0) < EPSILON;

        System.out.println(isTrue);
    }
}
