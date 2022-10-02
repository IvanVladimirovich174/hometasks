package secondhometask.firstpart;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task10 {
    public static void main(String[] args) {
        game();
    }

    public static void game() {

        int m = ThreadLocalRandom.current().nextInt(0, 1001);

        Scanner scanner = new Scanner(System.in);

        boolean isEqual = false;
        int n;
        do {
            n = scanner.nextInt();
            if (n < 0) {
                return;
            }
            if (n < m) {
                System.out.println("Это число меньше загаданного");
            } else if (n > m) {
                System.out.println("Это число больше загаданного");
            } else {
                System.out.println("Победа!");
                isEqual = true;
            }
        } while (!isEqual);
    }
}

