package basicmodule.secondhometask.firstpart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        for (int j = 0; j < m; j++) {
            int temp = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = temp;
        }

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
