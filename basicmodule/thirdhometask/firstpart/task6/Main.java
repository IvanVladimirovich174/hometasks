package basicmodule.thirdhometask.firstpart.task6;

public class Main {
    public static void main(String[] args) {
        AmazingString amazingString1 = new AmazingString(new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', ' ', '1', '2', '3', '4', '5'});
        AmazingString amazingString2 = new AmazingString("    \tabcdefg 12345");

        amazingString1.print();
        amazingString2.print();

        System.out.println(amazingString1.charAt(0));
        System.out.println(amazingString2.charAt(10));
        System.out.println();

        System.out.println(amazingString1.contains(new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'}));
        System.out.println(amazingString2.contains("acdс"));
        System.out.println();

        amazingString1.deleteLeadingWhitespaces().print();
        amazingString2.deleteLeadingWhitespaces().print();
        System.out.println();

        amazingString1.reverse().print();
        amazingString2.reverse().print();
    }
}
