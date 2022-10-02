package firsthometask.firstpart;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double rms = Math.sqrt((a * a + b * b) / 2.0);
        System.out.println(rms);
    }
}
