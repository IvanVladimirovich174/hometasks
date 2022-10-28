package thirdhometask.thirdpart.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeWinners {
    public static List<Participant> getThreeWinners(ArrayList<Participant> participants) {
        participants.sort(Collections.reverseOrder());

        if (participants.size() > 3) {
            return participants.subList(0, 3);
        } else {
            return participants;
        }
    }
}
