package basicmodule.firsthometask.secondpart;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] grade = new int[3];

        for (int i = 0; i < grade.length; i++) {
            grade[i] = scanner.nextInt();
        }

        boolean isDecreasing = true;
        for (int i = 0; i < grade.length - 1; i++) {
            if (grade[i] <= grade[i + 1]) {
                isDecreasing = false;
            }
        }

        System.out.println(isDecreasing ? "Петя, пора трудиться" : "Петя молодец!");
    }
}
