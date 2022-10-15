package firsthometask.secondpartadditional;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mailPackage = scanner.nextLine();

        mailPackage = mailPackage.replaceAll("[^a-zA-Z[а-яёА-ЯЁ[ !]]]","");

        if((mailPackage.startsWith("запрещенная продукция") && mailPackage.endsWith("камни!") || mailPackage.startsWith("камни!") && mailPackage.endsWith("запрещенная продукция"))) {
            System.out.println("в посылке камни и запрещенная продукция");
        } else if (mailPackage.startsWith("камни!") || mailPackage.endsWith("камни!")) {
            System.out.println("камни в посылке");
        } else if(mailPackage.startsWith("запрещенная продукция") || mailPackage.endsWith("запрещенная продукция")) {
            System.out.println("в посылке запрещенная продукция");
        } else System.out.println("все ок");
    }
}
