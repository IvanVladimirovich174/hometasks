package firsthometask.secondpartadditional;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValid = password.matches("(?=.*\\d)(?=.*[a-z[а-яё]])(?=.*[A-Z[А-ЯЁ]])(?=.*[_\\-*]).{8,}");

        System.out.println((isValid) ? "пароль надежный" : "пароль не прошел проверку");
    }
}
