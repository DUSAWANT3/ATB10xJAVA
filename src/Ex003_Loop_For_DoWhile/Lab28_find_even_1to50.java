package Ex003_Loop_For_DoWhile;

import java.sql.SQLOutput;

public class Lab28_find_even_1to50 {
    public static void main(String[] args) {
        //find even number between 1 to 50
        System.out.println("Even numbers from 1 to 50:");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("odd number from 1 to 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
  //use Continue to print even and odd numbers
        System.out.println();
        System.out.println("use Continue to print even and odd numbers:");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> "+i);
                continue;//it  skip the below code and move to top
            }
            System.out.println("odd ->"+i);
        }

    }
}
