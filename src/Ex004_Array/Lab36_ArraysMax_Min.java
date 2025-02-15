package Ex004_Array;
public class Lab36_ArraysMax_Min {
    public static void main(String[] args) {

        int[] array = {25, 24, 56, 77, 88, 58, 34, 23, 86};
        // max & min
        int max_output = give_max(array);
        System.out.println("Maximum value: " + max_output);

        int min_output = give_min(array);
        System.out.println("Minimum value: " + min_output);
    }

    static int give_max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) { // Start from index 1 for efficiency
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int give_min(int[] array) { // Moved outside give_max
        int min = array[0];
        for (int i = 1; i < array.length; i++) { // Start from index 1 for efficiency
            if (array[i] < min) { // Corrected condition
                min = array[i];
            }
        }
        return min;
}
}
