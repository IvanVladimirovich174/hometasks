package basicmodule.firsthometask;

import java.util.Scanner;

public class NextEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n + 2 - ((n % 2) ^ (-1) + 1));
    }
}
