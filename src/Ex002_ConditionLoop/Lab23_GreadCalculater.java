package Ex002_ConditionLoop;

import java.util.Scanner;

public class Lab23_GreadCalculater {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in); //Get input from User
        System.out.println("Enter your Markes (0 to 100) = ");
        int Markes = SC.nextInt();
       char Gread = 'F'; //defoult value og local variable is good practice.6

        if (Markes >= 90 && Markes <= 100) {
            System.out.println("Gread = A ");
        } else if (Markes >= 80 && Markes < 90) {
            System.out.println("Gread = B ");
        } else if (Markes >= 70 && Markes < 80) {
            System.out.println("Gread = C ");
        } else if (Markes >= 60 && Markes < 70) {
            System.out.println("Gread = D ");
        } else if (Markes >= 50 && Markes < 60) {
            System.out.println("Gread = E ");
        } else {
            System.out.println("Retake the Exam");
        }

        if (Markes >= 90 && Markes <= 100) {
            Gread = 'A';
        } else if (Markes >= 80 && Markes < 90) {
            Gread = 'B';
        } else if (Markes >= 70 && Markes < 80) {
            Gread = 'C';
        } else if (Markes >= 60 && Markes < 70) {
            Gread = 'D';
        } else if (Markes >= 50 && Markes < 60) {
            Gread = 'E';
        } else if (Markes <=0 || Markes > 100){
            System.out.println("It's not valid Markes");
            Gread = '-';
        }

        System.out.println("Your Gread is " + Gread);

        SC.close();
    }
}
