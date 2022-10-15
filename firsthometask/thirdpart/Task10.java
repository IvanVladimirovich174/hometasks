package firsthometask.thirdpart;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            if (i != n) {
                System.out.print(" ");
            } else {
                System.out.println("|");
            }
        }
    }
}

