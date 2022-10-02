package secondhometask.secondpart;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return n;
        }
        if (n < 0) {
            n *= -1;
        }
        return n % 10 + sumDigits(n / 10);
    }
}