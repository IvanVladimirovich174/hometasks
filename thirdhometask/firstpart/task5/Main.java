package thirdhometask.firstpart.task5;

public class Main {
    public static void main(String[] args) {
        DayOfWeek[] daysOfWeek = new DayOfWeek[7];

        daysOfWeek[0] = new DayOfWeek((byte) 1, "Monday");
        daysOfWeek[1] = new DayOfWeek((byte) 2, "Tuesday");
        daysOfWeek[2] = new DayOfWeek((byte) 3, "Wednesday");
        daysOfWeek[3] = new DayOfWeek((byte) 4, "Thursday");
        daysOfWeek[4] = new DayOfWeek((byte) 5, "Friday");
        daysOfWeek[5] = new DayOfWeek((byte) 6, "Saturday");
        daysOfWeek[6] = new DayOfWeek((byte) 7, "Sunday");

        for (DayOfWeek day : daysOfWeek) {
            System.out.println(day);
        }
    }
}
