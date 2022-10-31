package basicmodule.thirdhometask.thirdpart.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(m);

        for (int i = 0; i < m; i++) {
            matrix.add(new ArrayList<>(n));
            for (int j = 0; j < n; j++) {
                matrix.get(i).add(i + j);
            }
        }

        for (ArrayList<Integer> line : matrix) {
            for (Integer column : line) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
