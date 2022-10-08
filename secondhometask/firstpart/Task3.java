package secondhometask.firstpart;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (x >= a[i]) {
                index = i + 1;
            } else {
                break;
            }
        }

        System.out.println(index);
    }
}
