package firsthometask.thirdpart;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += Math.pow(m, i);
        }
        System.out.println(sum);
    }
}
