package profilemodule.firsthometask.task3;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path inputFilePath = Path.of("C://Users/PARCEVAL/IdeaProjects/hometasks/profilemodule/task3/input.txt");
        Path outputFilePath = Path.of("C://Users/PARCEVAL/IdeaProjects/hometasks/profilemodule/task3/output.txt");

        ChangeLatinCharsToUpperCase.changeLatinCharsToUpperCase(inputFilePath, outputFilePath);
    }
}
