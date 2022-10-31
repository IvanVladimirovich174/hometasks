package basicmodule.firsthometask.secondpart;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Ура, выходные!");
        } else {
            System.out.println(6 - dayNumber);
        }
    }
}
