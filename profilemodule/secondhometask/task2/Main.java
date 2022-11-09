package profilemodule.secondhometask.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        ArrayList<Character> sCharsList = new ArrayList<>();
        ArrayList<Character> tCharsList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            sCharsList.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            tCharsList.add(t.charAt(i));
        }

        if (sCharsList.size() == tCharsList.size()) {
            sCharsList.removeAll(tCharsList);
        } else {
           return false;
        }

        return (sCharsList.size() == 0);
    }
}
