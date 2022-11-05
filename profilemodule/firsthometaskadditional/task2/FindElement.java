package profilemodule.firsthometaskadditional.task2;

public class FindElement {
    public static int getIndexOfTheSearchedElement(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < array[mid])
                high = mid - 1;
            else if (key == array[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}
