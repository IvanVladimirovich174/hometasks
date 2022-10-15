package secondhometask.secondpart;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printDigits(n);
    }

    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        printDigits(n / 10);
        System.out.print(n % 10 + " ");
    }
}
