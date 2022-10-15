package secondhometask.secondpart;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        String[] s = new String[7];
        String[][] sParse = new String[7][4];

        for (int i = 0; i < 7; i++) {
            s[i] = scanner.nextLine();
            sParse[i] = s[i].split(" ");
        }

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumK = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 7; i++) {
                if (j == 0) {
                    sumA = sumA + Integer.parseInt(sParse[i][j]);
                }
                if (j == 1) {
                    sumB = sumB + Integer.parseInt(sParse[i][j]);
                }
                if (j == 2) {
                    sumC = sumC + Integer.parseInt(sParse[i][j]);
                }
                if (j == 3) {
                    sumK = sumK + Integer.parseInt(sParse[i][j]);
                }
            }
        }

        if ((a >= sumA) && (b >= sumB) && (c >= sumC) && (k >= sumK)) {
            System.out.println("Отлично");
        } else {
            System.out.println("Нужно есть поменьше");
        }
    }
}
