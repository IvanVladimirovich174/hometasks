package firsthometask.thirdpart;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = m; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
