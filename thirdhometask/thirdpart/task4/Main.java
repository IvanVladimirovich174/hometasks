package thirdhometask.thirdpart.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Participant> participants = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            participants.add(new Participant(scanner.nextLine()));
        }

        for (int i = 0; i < n; i++) {
            participants.get(i).setDog(new Dog(scanner.nextLine()));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 3; j++) {
                participants.get(i).getDog().addRate(scanner.nextDouble());
            }
            scanner.nextLine();
        }

        List<Participant> threeWinners = ThreeWinners.getThreeWinners(participants);
        for (Participant winner : threeWinners) {
            System.out.println(winner);
        }
    }
}
