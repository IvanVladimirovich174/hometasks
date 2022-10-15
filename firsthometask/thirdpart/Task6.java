package firsthometask.thirdpart;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 8; i >= 1; i /= 2) {
            System.out.print(n / i + " ");
            n = n % i;
        }
    }
}
