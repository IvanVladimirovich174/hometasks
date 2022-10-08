package secondhometask.firstpart;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextDouble();
        }

        System.out.println(sum / n);
    }
}
