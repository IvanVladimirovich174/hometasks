package firsthometask.secondpart;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initialString = scanner.nextLine();

        int indexSpace = initialString.lastIndexOf(" ");

        String firstStringPart = initialString.substring(0, indexSpace);
        String secondStringPart = initialString.substring(indexSpace + 1);

        System.out.println(firstStringPart);
        System.out.println(secondStringPart);
    }
}
