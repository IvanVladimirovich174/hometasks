package basicmodule.secondhometask.secondpart;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int[] min = new int[m];
        for (int i = 0; i < m; i++) {
            min[i] = a[i][0];
            for (int j = 0; j < n; j++) {
                if (a[i][j] < min[i]) {
                    min[i] = a[i][j];
                }
            }
        }

        for (int minElement : min) {
            System.out.print(minElement + " ");
        }
    }
}
