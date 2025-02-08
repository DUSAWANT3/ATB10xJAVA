package Ex002_ConditionLoop;

import java.util.Scanner;

public class Lab21_IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = sc.nextInt();
        System.out.println("You entered = "+age);
        //if user enter innvalted input--java.util.InputMismatchException
        if(age >= 18){
            System.out.println("Allowes to vote!");
        } else {
            System.out.println("Not Allowed!");
        }
        sc.close();
    }
}
