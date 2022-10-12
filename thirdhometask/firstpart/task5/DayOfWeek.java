package thirdhometask.firstpart.task5;

public class DayOfWeek {
    private byte dayOfWeek;
    private String dayOfWeekName;

    public DayOfWeek(byte dayOfWeek, String dayOfWeekName) {
        this.dayOfWeek = dayOfWeek;
        this.dayOfWeekName = dayOfWeekName;
    }

    @Override
    public String toString() {
        return dayOfWeek + " " + dayOfWeekName;
    }
}
