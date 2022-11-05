package profilemodule.firsthometaskadditional.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }

        int p = scanner.nextInt();

        int index = FindElement.getIndexOfTheSearchedElement(m, p);
        System.out.println(index);
    }
}
