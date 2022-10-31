package basicmodule.firsthometask.secondpart;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

        String message = (hour > 12) ? "Пора" : "Рано";

        System.out.println(message);
    }
}
