package profilemodule.firsthometask.task1;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyCheckedException("Checked exception");
        } catch (MyCheckedException myCheckedException) {
            System.out.println(myCheckedException.getMessage());
        }
    }
}
