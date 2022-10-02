package secondhometask.firstpart;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();

        int minAbs = Math.abs(a[0] - m);
        int maxA = a[0];

        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - m) <= minAbs) {
                minAbs = Math.abs(a[i] - m);
                if (maxA < a[i]) {
                    maxA = a[i];
                }
            }
        }
        System.out.println(maxA);
    }
}
