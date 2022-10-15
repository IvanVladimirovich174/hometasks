package secondhometask.secondpart;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int p = scanner.nextInt();
        int rowIndex = 0;
        int columnIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == p) {
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }

        int[][] aNew = new int[n - 1][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < rowIndex && j < columnIndex) {
                    aNew[i][j] = a[i][j];
                } else if (i < rowIndex && j > columnIndex) {
                    aNew[i][j - 1] = a[i][j];
                } else if (i > rowIndex && j < columnIndex) {
                    aNew[i - 1][j] = a[i][j];
                } else if (i > rowIndex && j > columnIndex) {
                    aNew[i - 1][j - 1] = a[i][j];
                }
            }
        }

        for (int i = 0; i < aNew.length; i++) {
            for (int j = 0; j < aNew.length; j++) {
                if (j != aNew.length - 1) {
                    System.out.print(aNew[i][j] + " ");
                } else System.out.print(aNew[i][j]);
            }
            System.out.println();
        }
    }
}