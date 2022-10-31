package basicmodule.thirdhometask.firstpart.task6;

public class AmazingString {
    private char[] s;

    AmazingString(char[] chars) {
        s = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            s[i] = chars[i];
        }
    }

    AmazingString(String s) {
        this.s = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            this.s[i] = s.charAt(i);
        }
    }

    public char charAt(int index) {
        if (index >= s.length) {
            throw new StringIndexOutOfBoundsException("String index out of range: " + index);
        }
        return s[index];
    }

    public int length() {
        return s.length;
    }

    public void print() {
        for (char c : s) {
            System.out.print(c);
        }
        System.out.println();
    }

    public boolean contains(char[] subChars) {
        char firstChar = subChars[0];
        int max = (this.s.length - subChars.length);

        for (int i = 0; i <= max; i++) {

            // look for first character
            if (this.s[i] != firstChar) {
                while ((i <= max) && (this.s[i] != firstChar)) {
                    i++;
                }
            }

            // found first character, now look at the rest of value
            if (i <= max) {
                int j = i + 1;
                int end = j + subChars.length - 1;
                for (int k = 1; j < end && this.s[j] == subChars[k]; j++, k++) ;
                if (j == end) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean contains(String subString) {
        AmazingString amazingSubString = new AmazingString(subString);
        return this.contains(amazingSubString.getCharArray());
    }

    public AmazingString deleteLeadingWhitespaces() {
        int i = 0;

        while (i < s.length && Character.isWhitespace(s[i])) {
            i++;
        }

        if (i != 0) {
            char[] result = new char[s.length - i];
            System.arraycopy(s, i, result, 0, result.length);
            return new AmazingString(result);
        } else {
            return this;
        }
    }

    public AmazingString reverse() {
        char tmp;
        char[] sReverse = s.clone();

        for (int i = 0; i < sReverse.length / 2; i++) {
            tmp = sReverse[sReverse.length - i - 1];
            sReverse[sReverse.length - i - 1] = sReverse[i];
            sReverse[i] = tmp;
        }
        return new AmazingString(sReverse);
    }

    private char[] getCharArray() {
        return s;
    }
}

