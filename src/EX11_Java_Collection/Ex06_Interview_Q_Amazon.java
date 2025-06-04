package EX11_Java_Collection;

import java.util.HashMap;
import java.util.Map;

public class Ex06_Interview_Q_Amazon {
    public static void main(String[] args) {
        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        // Print frequency and unique numbers
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            System.out.println(number + " = " + count);
            if (count == 1) {
                System.out.println(number + " is unique number");
            }
        }
    }
}