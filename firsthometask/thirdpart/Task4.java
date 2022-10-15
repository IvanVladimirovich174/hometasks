package firsthometask.thirdpart;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.charAt(i));
        }
    }
}
