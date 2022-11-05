package profilemodule.firsthometaskadditional.task1;

public class FindTwoMax {
    public static void findTwoBiggestNumsOfArray(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array length should be more than two");
        }

        int biggest;
        int secondBiggest;

        if (array[0] >= array[1]) {
            biggest = array[0];
            secondBiggest = array[1];
        } else {
            biggest = array[1];
            secondBiggest = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] >= biggest && secondBiggest != array[i]) {
                secondBiggest = biggest;
                biggest = array[i];
            }
        }

        System.out.println(biggest + " " + secondBiggest);
    }
}
