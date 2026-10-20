import java.util.HashMap;
import java.util.Map;

public class Assignment8_2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 2, 3, 3, 3};

        Map<Integer, Integer> count = new HashMap<>();

        int mode = arr[0];
        int maxCount = 0;

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);

            if (count.get(num) > maxCount) {
                maxCount = count.get(num);
                mode = num;
            }
        }

        System.out.println("Mode = " + mode);
        System.out.println("Occurrences = " + maxCount);
    }
}