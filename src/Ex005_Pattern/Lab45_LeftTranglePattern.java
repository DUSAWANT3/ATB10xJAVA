package Ex005_Pattern;

import java.util.Scanner;

public class Lab45_LeftTranglePattern {
    public static void main(String[] args) {
        //*
        //* *
        //* * *
        //row -5  ; coloum - 5 ( 5 X 5 matrix )
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

        //Inverted right angle trangle
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
