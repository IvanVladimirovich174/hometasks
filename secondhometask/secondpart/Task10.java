package secondhometask.secondpart;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printDigitsReverse(n);
    }

    public static int printDigitsReverse(int n) {

        if (n == 0) {
            return n;
        }

        System.out.print(n % 10 + " ");

        return printDigitsReverse(n / 10);
    }
}
