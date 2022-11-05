package profilemodule.firsthometask.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int n = inputN();
            System.out.println("Успешный ввод!");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static int inputN() throws Exception {
        System.out.println("Введите число n, 0 < n < 100");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ((n <= 0) || (n >= 100)) {
            throw new Exception("Неверный ввод");
        }
        return n;
    }
}