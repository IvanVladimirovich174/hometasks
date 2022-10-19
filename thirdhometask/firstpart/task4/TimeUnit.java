package thirdhometask.firstpart.task4;

public class TimeUnit {
    private final int SECONDS_PER_MINUTE = 60;
    private final int MINUTES_PER_HOUR = 60;
    private final int HOURS_PER_DAY = 24;
    private int hours;
    private int minutes;
    private int seconds;

    TimeUnit(int hours, int minutes, int seconds) {
        if (!isTimeValid(hours, minutes, seconds)) {
            throw new IllegalArgumentException("Time should be positive number!");
        }

        if (seconds < SECONDS_PER_MINUTE) {
            this.seconds = seconds;
        } else {
            minutes = minutes + seconds / SECONDS_PER_MINUTE;
            this.seconds = seconds % SECONDS_PER_MINUTE;
        }

        if (minutes < MINUTES_PER_HOUR) {
            this.minutes = minutes;
        } else {
            hours = hours + minutes / MINUTES_PER_HOUR;
            this.minutes = minutes % MINUTES_PER_HOUR;
        }

        if (hours < HOURS_PER_DAY) {
            this.hours = hours;
        } else {
            this.hours = hours % HOURS_PER_DAY;
        }
    }

    TimeUnit(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    TimeUnit(int hours) {
        this(hours, 0, 0);
    }

    public void printTime24() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void printTime12() {
        if (hours == 0) {
            System.out.printf("%02d:%02d:%02d am\n", 12, minutes, seconds);
        } else if (hours == 12) {
            System.out.printf("%02d:%02d:%02d pm\n", hours, minutes, seconds);
        } else if (hours > 12) {
            System.out.printf("%02d:%02d:%02d pm\n", hours % 12, minutes, seconds);
        } else {
            System.out.printf("%02d:%02d:%02d am\n", hours, minutes, seconds);
        }
    }

    public void addTime(int hours, int minutes, int seconds) {
        if (!isTimeValid(hours, minutes, seconds)) {
            throw new IllegalArgumentException("Time should be positive number!");
        }

        this.hours = this.hours + hours;
        this.minutes = this.minutes + minutes;
        this.seconds = this.seconds + seconds;

        if (this.seconds >= SECONDS_PER_MINUTE) {
            this.minutes = this.minutes + this.seconds / SECONDS_PER_MINUTE;
            this.seconds = this.seconds % SECONDS_PER_MINUTE;
        }

        if (this.minutes >= MINUTES_PER_HOUR) {
            this.hours = this.hours + this.minutes / MINUTES_PER_HOUR;
            this.minutes = this.minutes % MINUTES_PER_HOUR;
        }

        if (this.hours >= HOURS_PER_DAY) {
            this.hours = this.hours % HOURS_PER_DAY;
        }
    }

    private boolean isTimeValid(int hours, int minutes, int seconds) {
        return !((seconds < 0) || (minutes < 0) || (hours < 0));
    }
}
