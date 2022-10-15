package firsthometask.firstpart;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstDigit = number / 10;
        int secondDigit = number % 10;

        System.out.println(secondDigit + "" + firstDigit);
    }
}
