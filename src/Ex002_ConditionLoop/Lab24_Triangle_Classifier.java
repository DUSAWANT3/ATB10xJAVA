package Ex002_ConditionLoop;

import java.util.Scanner;

public class Lab24_Triangle_Classifier {
    public static void main(String[] args) {

        //Triangle Classifier:
//Write a program that classifies a triangle based on its side lengths.
//Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// Isosceles (exactly two sides are equal),
// or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side2 > eq, iso, scalene

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter triangle length Side A =");
        int SideA = SC.nextInt();
        System.out.println("Enter triangle length Side B =");
        int SideB = SC.nextInt();
        System.out.println("Enter triangle length Side C =");
        int SideC = SC.nextInt();
        String Triangle = "TrangleType";

        if (SideA == SideB && SideB == SideC) {
            Triangle = "Equilateral";
        } else if (SideA == SideB && SideA == SideC) {
            Triangle = "Isosceles";
        }else if (SideA < 0 || SideB < 0 || SideC < 0) {
                Triangle = "Please Reenter the value";
        } else {
            Triangle = "Scalene";
        }
        System.out.println("The Triangle is " + Triangle);

        SC.close();
    }

}
