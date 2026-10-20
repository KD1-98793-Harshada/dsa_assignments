import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Assignment8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line:");
        String line = sc.nextLine();

        String[] words = line.toLowerCase().split("\\s+");

        Map<String, Integer> count = new LinkedHashMap<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word occurrences:");

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}