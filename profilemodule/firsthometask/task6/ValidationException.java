package profilemodule.firsthometask.task6;

public class ValidationException extends Exception {
    ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
