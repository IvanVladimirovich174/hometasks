package thirdhometask.thirdpart.task1;

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();

        System.out.println(bat.getClass().getSimpleName() + ":");
        bat.eat();
        bat.sleep();
        bat.birth();
        bat.fly();
        System.out.println();

        Dolphin dolphin = new Dolphin();
        System.out.println(dolphin.getClass().getSimpleName() + ":");
        dolphin.eat();
        dolphin.sleep();
        dolphin.birth();
        dolphin.swim();
        System.out.println();

        GoldFish goldFish = new GoldFish();
        System.out.println(goldFish.getClass().getSimpleName() + ":");
        goldFish.eat();
        goldFish.sleep();
        goldFish.birth();
        goldFish.swim();
        System.out.println();

        Eagle eagle = new Eagle();
        System.out.println(eagle.getClass().getSimpleName() + ":");
        eagle.eat();
        eagle.sleep();
        eagle.birth();
        eagle.fly();
        System.out.println();
    }
}
