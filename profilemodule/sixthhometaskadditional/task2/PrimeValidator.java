package profilemodule.sixthhometaskadditional.task2;

public class PrimeValidator {
    public static boolean isPrimeNumber(int number) {
        if ((number > 2 && number % 2 == 0) || (number == 0) || (number == 1)) {
            return false;
        }

        for (int i = 3; i <= (int) Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}