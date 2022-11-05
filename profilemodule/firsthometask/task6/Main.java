package profilemodule.firsthometask.task6;

public class Main {
    public static void main(String[] args) {
        String smallWrongName = "a";
        String uncapitalizedName = "albert";
        String name = "Albert";

        try {
            FormValidator.checkName(smallWrongName);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkName(uncapitalizedName);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkName(null);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkName(name);
        } catch (ValidationException e) {
            System.out.println("Will not be printed");
        }

        String tooOldBirthDate = "01.01.1200";
        String birthDateFromFuture = "01.01.3000";
        String normalBirthDate = "01.01.1991";
        String invalidString = "asdf";

        try {
            FormValidator.checkBirthdate(tooOldBirthDate);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkBirthdate(birthDateFromFuture);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkBirthdate(invalidString);
        } catch (ValidationException e) {
            System.out.println("Cause: " + e.getCause());
        }

        try {
            FormValidator.checkBirthdate(null);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkBirthdate(normalBirthDate);
        } catch (ValidationException e) {
            System.out.println("Will not be printed");
        }

        String wrongGender = "Genderqueer";
        String male = "Male";
        String female = "Female";

        try {
            FormValidator.checkGender(wrongGender);
        } catch (ValidationException e) {
            System.out.println("Cause: " + e.getCause());
        }

        try {
            FormValidator.checkGender(null);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkGender(male);
        } catch (ValidationException e) {
            System.out.println("Will not be printed");
        }

        try {
            FormValidator.checkGender(female);
        } catch (ValidationException e) {
            System.out.println("Will not be printed");
        }

        String wrongHeight = "asf";
        String negativeHeight = "-1";
        String normalHeight = "6.0";

        try {
            FormValidator.checkHeight(wrongHeight);
        } catch (ValidationException e) {
            System.out.println("Cause: " + e.getCause());
        }

        try {
            FormValidator.checkHeight(negativeHeight);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkHeight(null);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            FormValidator.checkHeight(normalHeight);
        } catch (ValidationException e) {
            System.out.println("Will not be printed");
        }
    }
}
