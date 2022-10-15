package secondhometask.firstpartadditional;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        if (n == 1) {
            System.out.println(a[0] * a[0]);
            return;
        }

        int[] result = new int[n];
        int leftIndex = 0;
        int rightIndex = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(a[rightIndex]) >= Math.abs(a[leftIndex])) {
                result[i] = a[rightIndex] * a[rightIndex];
                rightIndex--;
            } else {
                result[i] = a[leftIndex] * a[leftIndex];
                leftIndex++;
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
