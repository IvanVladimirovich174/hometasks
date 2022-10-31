package basicmodule.firsthometask.secondpart;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        final double EPSILON = 1E-14;

        boolean isTrue = Math.abs(Math.log(Math.exp(n)) - n) < EPSILON;

        System.out.println(isTrue);
    }
}
