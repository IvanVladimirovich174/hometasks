package profilemodule.firsthometask.task3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeLatinCharsToUpperCase {
    public static void changeLatinCharsToUpperCase(Path inputFilePath, Path outputFilePath) {
        try (
                BufferedReader reader = Files.newBufferedReader(inputFilePath, StandardCharsets.UTF_8);
                BufferedWriter writer = Files.newBufferedWriter(outputFilePath, StandardCharsets.UTF_8);
        ) {
            int charDigits;
            while ((charDigits = reader.read()) != -1) {
                if (charDigits >= 'a' && charDigits <= 'z') {
                    writer.write(charDigits - 32);
                } else {
                    writer.write(charDigits);
                }
            }
        } catch (IOException ioexception) {
            System.out.println(ioexception.getMessage());
        }
    }
}
