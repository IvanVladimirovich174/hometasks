package firsthometask.thirdpart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        while (m >= n) {
            m = m - n;
        }
        System.out.println(m);
    }
}
