package firsthometask.secondpart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int discriminant = b * b - 4 * a * c;

        String message = (discriminant < 0) ? "Решения нет" : "Решение есть";
        System.out.println(message);

    }
}
