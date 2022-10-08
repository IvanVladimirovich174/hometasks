package firsthometask.secondpart;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count >= 3500) {
            System.out.println("fluent");
        } else if (count >= 2500) {
            System.out.println("upper-intermediate");
        } else if (count >= 1500) {
            System.out.println("intermediate");
        } else if (count >= 500) {
            System.out.println("pre-intermediate");
        } else System.out.println("beginner");
    }
}
