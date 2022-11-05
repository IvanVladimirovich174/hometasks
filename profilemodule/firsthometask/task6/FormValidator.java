package profilemodule.firsthometask.task6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FormValidator {
    private final static int MIN_NAME_LEN = 2;
    private final static int MAX_NAME_LEN = 20;
    private final static String NAME_LEN_EXCEPTION = "Name should be between 2 and 20 letters";
    private final static String NAME_CAPITALIZED_EXCEPTION = "Name should be capitalized";
    private final static String OLDEST_POSSIBLE_DATE = "01.01.1900";
    private final static String DATE_PATTERN = "dd.MM.yyyy";
    private final static String INVALID_DATE_EXCEPTION = "Invalid date";
    private final static String GENDER_EXCEPTION = "Gender should be Female or Male";
    private final static String HEIGHT_EXCEPTION = "Height should be positive number";

    private enum Gender {
        Male, Female
    }

    public static void checkName(String str) throws ValidationException {
        if (str == null) {
            throw new ValidationException("Cannot use String object because \"str\" is null");
        }

        if (str.length() < MIN_NAME_LEN || str.length() > MAX_NAME_LEN) {
            throw new ValidationException(NAME_LEN_EXCEPTION);
        }

        if (!Character.isUpperCase(str.charAt(0))) {
            throw new ValidationException(NAME_CAPITALIZED_EXCEPTION);
        }
    }

    public static void checkBirthdate(String str) throws ValidationException {
        if (str == null) {
            throw new ValidationException("Cannot use String object because \"str\" is null");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        LocalDate oldestPossible = LocalDate.parse(OLDEST_POSSIBLE_DATE, formatter);
        LocalDate birthDate;

        try {
            birthDate = LocalDate.parse(str, formatter);
        } catch (DateTimeParseException e) {
            throw new ValidationException(INVALID_DATE_EXCEPTION, e);
        }

        if (birthDate.isBefore(oldestPossible) || birthDate.isAfter(LocalDate.now())) {
            throw new ValidationException(INVALID_DATE_EXCEPTION);
        }
    }

    public static void checkGender(String str) throws ValidationException {
        if (str == null) {
            throw new ValidationException("Cannot use String object because \"str\" is null");
        }

        try {
            Gender genderToBe = Gender.valueOf(str);
        } catch (IllegalArgumentException e) {
            throw new ValidationException(GENDER_EXCEPTION, e);
        }
    }

    public static void checkHeight(String str) throws ValidationException {
        if (str == null) {
            throw new ValidationException("Cannot use String object because \"str\" is null");
        }

        double height;

        try {
            height = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new ValidationException(HEIGHT_EXCEPTION, e);
        }

        if (height < 0) {
            throw new ValidationException(HEIGHT_EXCEPTION);
        }
    }
}
