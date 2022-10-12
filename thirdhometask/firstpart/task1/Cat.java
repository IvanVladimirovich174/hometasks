package thirdhometask.firstpart.task1;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private void sleep() {
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        int whichMethodToCall = ThreadLocalRandom.current().nextInt(0, 3);

        switch (whichMethodToCall) {
            case 0 -> sleep();
            case 1 -> meow();
            case 2 -> eat();
        }
    }
}
