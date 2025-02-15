package Ex004_Array;

import java.util.Arrays;

public class Lab40_Second_largest_Number {
    public static void main(String[] args) {

     //Find Second largest number
        int[] a = {5, 67, 39, 2, 4, 88};
        Arrays.sort(a);
        System.out.println(a[a.length-2]);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("-----------------------------------");

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // sort an array without using any functions.
        //Hint - compare and replace(temp)

        //useing the Bubble Sort algorithm to sort the array
        for (int i = 0; i < numbers.length - 1; i++) {  // Outer loop for passes
            for (int j = 0; j < numbers.length - 1 - i; j++) {  // Inner loop for comparisons
                if (numbers[j] > numbers[j + 1]) {  // Swap if the current element is greater than the next
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }

    }
}
