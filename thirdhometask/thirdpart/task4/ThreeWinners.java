package thirdhometask.thirdpart.task4;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeWinners {
    public static ArrayList<Participant> findThreeWinners(ArrayList<Participant> participants) {
        Collections.sort(participants);

        ArrayList<Participant> threeWinners = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            threeWinners.add(participants.get(participants.size() - i));
        }
        return threeWinners;
    }
}
