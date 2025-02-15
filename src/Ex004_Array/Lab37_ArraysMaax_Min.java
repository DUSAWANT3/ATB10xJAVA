package Ex004_Array;

public class Lab37_ArraysMaax_Min {
    public static void main(String[] args) {

        int[] a = {5, 67, 39, 2, 4, 88, 45, 96, 99};

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximun Number : " + max);

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimun Number : " + min);
    }
}
