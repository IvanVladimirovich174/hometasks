package secondhometask.secondpart;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == x) && (i == y)) {
                    matrix[i][j] = 'K';
                } else if ((j == x + 2 || j == x - 2) && (i == y + 1 || i == y - 1)
                        || (j == x + 1 || j == x - 1) && (i == y + 2 || i == y - 2)) {
                    matrix[i][j] = 'X';
                } else {
                    matrix[i][j] = '0';
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
