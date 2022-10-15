package secondhometask.firstpart;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].equals(s[j])) {
                    System.out.println(s[i]);
                    return;
                }
            }
        }
    }
}



