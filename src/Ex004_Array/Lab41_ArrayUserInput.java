package Ex004_Array;

import java.util.Scanner;

public class Lab41_ArrayUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Number");
            numbers[i] = sc.nextInt();
        }

        System.out.println("-----------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ,");
        }
    }
}
