
import java.util.Arrays;

public class Assign7_1 {

    
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        insertionSortDescending(arr);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
