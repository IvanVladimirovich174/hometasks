package firsthometask.firstpart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        final double CENTIMETERS_PER_INCH = 2.54;

        Scanner scanner = new Scanner(System.in);
        double count = scanner.nextDouble();

        System.out.println(CENTIMETERS_PER_INCH * count);
    }
}