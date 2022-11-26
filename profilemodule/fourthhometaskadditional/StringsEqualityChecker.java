package profilemodule.fourthhometaskadditional;

public class StringsEqualityChecker {
    public static boolean isStringsEquality(String firstString, String secondString) {
        if (Math.abs(firstString.length() - secondString.length()) > 1) {
            return false;
        }

        if (firstString.equals(secondString)) {
            return true;
        }

        // Index of element after same prefix
        int prefix = 0;

        // Index of element after same postfix
        int postfix1 = firstString.length() - 1;
        int postfix2 = secondString.length() - 1;

        int minLength = Math.min(firstString.length(), secondString.length());

        while ((prefix < minLength) && (firstString.charAt(prefix) == secondString.charAt(prefix))) {
            prefix++;
        }

        while (postfix1 >= 0
                && postfix2 >= 0
                && firstString.charAt(postfix1) == secondString.charAt(postfix2)) {
            postfix1--;
            postfix2--;
        }

        return ((postfix1 <= prefix) && (postfix2 <= prefix));
    }
}