package firsthometask.secondpart;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isPossibleCreateTriangle = (b + c > a) && (a + c > b) && (a + b > c);

        System.out.println(isPossibleCreateTriangle);
    }
}
