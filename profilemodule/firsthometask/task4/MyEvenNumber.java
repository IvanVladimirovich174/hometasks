package profilemodule.firsthometask.task4;

public class MyEvenNumber {
    private int n;

    public MyEvenNumber(int n) {
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Enter even number");
        } else {
            this.n = n;
        }
    }

    public int getN() {
        return n;
    }
}
