package Ex005_Pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab046_RightAlingRightTrangle {
    public static void main(String[] args) {
        //  *
        // **
        //***
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valur n = ");

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
