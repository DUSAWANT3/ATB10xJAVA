package Ex004_Array;

public class Lab38_Reverse_Order_Array {
    public static void main(String[] args) {
//Print Reverse order Array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println(); //new line

        String[] names = {"a", "b", "c", "d"};
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + ", ");
        }
    }
}
