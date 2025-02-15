package Ex004_Array;

public class lab39_SumOf_Array {
    public static void main(String[] args) {
        int[] a = {5, 67, 39, 2, 4, 88};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
                 sum= sum + a[i];
        }
        System.out.println("Sum of Array = " + sum);

        System.out.println("------------------------------");
//for each loop
        for (int n : a){
            sum =sum+n;
        }
        System.out.println("Sum of Array = " + sum);
    }
}
