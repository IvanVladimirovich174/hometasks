package thirdhometask.firstpart.task4;

public class Main {
    public static void main(String[] args) {
        TimeUnit time1 = new TimeUnit(48, 59, 59);
        TimeUnit time2 = new TimeUnit(3, 59);
        TimeUnit time3 = new TimeUnit(15);

        System.out.println("time1 before adding:");
        time1.printTime24();
        time1.printTime12();
        System.out.println();

        System.out.println("time2 before adding:");
        time2.printTime24();
        time2.printTime12();
        System.out.println();

        System.out.println("time3 before adding:");
        time3.printTime24();
        time3.printTime12();
        System.out.println();

        time1.addTime(48, 0, 3);
        time2.addTime(12, 1, 1);
        time3.addTime(9, 7, 120);

        System.out.println("time1 after adding:");
        time1.printTime24();
        time1.printTime12();
        System.out.println();

        System.out.println("time2 after adding:");
        time2.printTime24();
        time2.printTime12();
        System.out.println();

        System.out.println("time3 after adding:");
        time3.printTime24();
        time3.printTime12();
    }
}
