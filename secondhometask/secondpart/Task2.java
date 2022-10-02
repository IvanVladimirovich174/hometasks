package secondhometask.secondpart;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= x1) && (j <= x2) && ((i == y1) || (i == y2))) {
                    matrix[i][j] = 1; //row
                } else if ((i >= y1) && (i <= y2) && ((j == x1) || (j == x2))) {
                    matrix[i][j] = 1; //column
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != n - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
