package basicmodule.secondhometask.firstpart;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; ) {
            int j = i;
            int element = a[j];
            int count = 0;
            while ((j < n) && (element == a[j])) {
                count++;
                j++;
            }
            i = j;
            System.out.println(count + " " + element);
        }
    }
}
