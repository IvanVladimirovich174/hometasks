package profilemodule.thirdhometaskadditional.task2;

import java.util.ArrayDeque;

public class MultiBracketValidator {
    public static boolean isValidSequenceOfBrackets(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}