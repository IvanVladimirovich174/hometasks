package secondhometask.firstpartadditional;

import java.security.SecureRandom;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        while (true) {
            n = scanner.nextInt();
            if (n < 8) {
                System.out.println("Пароль с " + n + " количеством символов небезопасен");
            } else {
                break;
            }
        }

        final char[] SPECIAL_CHARS = {'*', '-', '_'};
        char[] pass = new char[n];
        SecureRandom sr = new SecureRandom();

        // fill pass with must have chars
        pass[0] = secureRandomChar(sr, 'a', 'z' + 1);
        pass[1] = secureRandomChar(sr, 'A', 'Z' + 1);
        pass[2] = secureRandomChar(sr, '0', '9' + 1);
        pass[3] = SPECIAL_CHARS[sr.nextInt(SPECIAL_CHARS.length)];

        // fill rest with random chars
        for (int i = 4; i < n; i++) {
            char[] charVariants = {
                    secureRandomChar(sr, 'a', 'z' + 1),
                    secureRandomChar(sr, 'A', 'Z' + 1),
                    secureRandomChar(sr, '0', '9' + 1),
                    SPECIAL_CHARS[sr.nextInt(SPECIAL_CHARS.length)]
            };
            pass[i] = charVariants[sr.nextInt(charVariants.length)];
        }

        // Fisher–Yates shuffle
        for (int i = n - 1; i > 0; i--) {
            int randomIndex = sr.nextInt(i + 1);
            char tmp = pass[i];
            pass[i] = pass[randomIndex];
            pass[randomIndex] = tmp;
        }

        // print result
        for (char c : pass) {
            System.out.print(c);
        }
    }

    public static char secureRandomChar(SecureRandom sr, int origin, int bound) {
        return (char) (sr.nextInt(bound - origin) + origin);
    }
}