package Ex002_ConditionLoop;

import java.util.Scanner;

public class Lab22_IfElse_IfElse {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the num1 =  ");
        int num1 = SC.nextInt();
        System.out.println("Enter the num2 =  ");
        int num2 = SC.nextInt();

        if(num1 > num2 ){
            System.out.println("num1");
        } else if (num2 > num1){
            System.out.println("num2");
        } else if (num1 == num2){
            System.out.println("Both are same num " + num1 + " = " +num2);
        }

        SC.close();
    }
}
