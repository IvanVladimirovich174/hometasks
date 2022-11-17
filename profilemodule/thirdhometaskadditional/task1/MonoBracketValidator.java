package profilemodule.thirdhometaskadditional.task1;

public class MonoBracketValidator {
    public static boolean isValidSequenceOfBrackets(String str) {
        int openBracketsCount = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                openBracketsCount++;
            } else {
                if (openBracketsCount == 0) {
                    return false;
                }
                openBracketsCount--;
            }
        }
        return openBracketsCount == 0;
    }
}