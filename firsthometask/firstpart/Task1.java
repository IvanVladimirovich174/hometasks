package firsthometask.firstpart;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double volume = 4 / 3.0 * Math.PI * Math.pow(radius, 3.0);

        System.out.println(volume);
    }
}

