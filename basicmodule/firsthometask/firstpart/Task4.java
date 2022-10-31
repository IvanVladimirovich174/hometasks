package basicmodule.firsthometask.firstpart;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println(count / SECONDS_PER_MINUTE / MINUTES_PER_HOUR + " " + count / SECONDS_PER_MINUTE % MINUTES_PER_HOUR);
    }
}
