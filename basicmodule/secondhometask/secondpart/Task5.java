package basicmodule.secondhometask.secondpart;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetrical = true;
        int m = n - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != a[n - j - 1][n - i - 1]) isSymmetrical = false;
                --m;
            }
        }
        System.out.println(isSymmetrical);
    }
}
