package profilemodule.sixthhometaskadditional.task2;

public class Main {
    public static void main(String[] args) {
        int[] primeNumbers = new int[]{
                3, 5, 7,
                11, 13, 17, 19
        };

        for (int primeNumber : primeNumbers) {
            if (PrimeValidator.isPrimeNumber(primeNumber)) {
                System.out.println("Number " + primeNumber + " is prime number");
            }
        }

        int[] notPrimeNumbers = new int[]{
                0, 1, 4, 6, 8, 9,
                10, 12, 14, 15, 16, 18, 20
        };

        for (int notPrimeNumber : notPrimeNumbers) {
            if (!PrimeValidator.isPrimeNumber(notPrimeNumber)) {
                System.out.println("Number " + notPrimeNumber + " isn't prime number");
            }
        }
    }
}