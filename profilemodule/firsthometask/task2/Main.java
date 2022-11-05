package profilemodule.firsthometask.task2;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyUncheckedException("Unchecked exception");
        } catch (MyUncheckedException myUncheckedException) {
            System.out.println(myUncheckedException.getMessage());
        }
    }
}