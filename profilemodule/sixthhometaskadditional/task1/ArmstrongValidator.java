package profilemodule.sixthhometaskadditional.task1;

public class ArmstrongValidator {
    public static boolean isArmstrongNumber(int number) {
        if (number == 0) {
            return false;
        }

        int copyOfNumber = number;
        int counterOfDigits = 0;

        while (copyOfNumber != 0) {
            copyOfNumber = copyOfNumber / 10;
            counterOfDigits++;
        }

        copyOfNumber = number;
        int sumOfRaisedDigits = 0;

        while (copyOfNumber != 0) {
            sumOfRaisedDigits += Math.pow(copyOfNumber % 10, counterOfDigits);
            copyOfNumber = copyOfNumber / 10;
        }

        return sumOfRaisedDigits == number;
    }
}