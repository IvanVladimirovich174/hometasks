package secondhometask.firstpart;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        if (n != m) {
            System.out.println(false);
            return;
        }

        boolean isEqual = true;
        for (int i = 0; i < m; i++) {
            int mInput = scanner.nextInt();
            if (a[i] != mInput) {
                isEqual = false;
                break;
            }
        }
        System.out.println(isEqual);
    }
}
