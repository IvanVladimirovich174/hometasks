package firsthometask.thirdpart;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        do {
            int a = scanner.nextInt();
            if (a < 0) {
                count++;
            } else {
                break;
            }
        } while (true);

        System.out.println(count);
    }
}
