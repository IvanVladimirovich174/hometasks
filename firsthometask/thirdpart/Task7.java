package firsthometask.thirdpart;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count = 0;
        char space = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != space) {
                count++;
            }
        }

        System.out.println(count);
    }
}
