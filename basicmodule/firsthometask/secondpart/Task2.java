package basicmodule.firsthometask.secondpart;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean isFirstQuadrant = (x > 0) && (y > 0);

        System.out.println(isFirstQuadrant);
    }
}
