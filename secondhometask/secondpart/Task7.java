package secondhometask.secondpart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = scanner.nextLine();
        }

        String[] nickName = new String[n];
        for (int i = 0; i < n; i++) {
            nickName[i] = scanner.nextLine();
        }

        int[][] grades = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                grades[i][j] = scanner.nextInt();
            }
        }

        //average calculation
        double[] average = new double[n];
        for (int i = 0; i < n; i++) {
            double sumGrades = 0;
            for (int j = 0; j < 3; j++) {
                sumGrades = sumGrades + grades[i][j];
            }
            average[i] = sumGrades / 3.0;
        }

        //sort all arrays for main column average
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (average[j] > average[j + 1]) {
                    double tempAverage = average[j];
                    average[j] = average[j + 1];
                    average[j + 1] = tempAverage;

                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;

                    String tempNickName = nickName[j];
                    nickName[j] = nickName[j + 1];
                    nickName[j + 1] = tempNickName;
                }
            }
        }
        //print result
        for (int i = n - 1; i > n - 4; i--) {
            System.out.print(name[i] + ": " + nickName[i] + ", " + BigDecimal.valueOf(average[i]).setScale(1, RoundingMode.DOWN));
            System.out.println();
        }
    }
}
