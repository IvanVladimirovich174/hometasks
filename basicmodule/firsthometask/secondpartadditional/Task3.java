package basicmodule.firsthometask.secondpartadditional;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        double price = scanner.nextDouble();

        String[] elements = model.split("[ ]");
        String brand = elements[0].toLowerCase();

        if((brand.contains("samsung") || brand.contains("iphone")) && (price >=50000 && price <= 120000)) {
            System.out.println("Можно купить");
        } else {
            System.out.println("Не подходит");
        }
    }
}
