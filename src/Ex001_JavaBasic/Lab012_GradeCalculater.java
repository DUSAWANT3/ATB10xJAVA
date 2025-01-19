package Ex001_JavaBasic;

import java.util.Scanner;

public class Lab012_GradeCalculater {
    public static void main(String[] args) {
   /*     Write a program that calculates and displays the letter grade for
   a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
           **Logic Building |. Coding Interview Crack**
       1. Step 1 ->. Find the inputs and outputs - data types and what is the exactly the out put interviewer looking.
        2. Step 2 - Rough logic , brute force - > explain it side by side.
        3. Step 3 - Write the logic and present the solution)
        4. Step 4 - Optimize and discussion.
        5. Step 5 - Edge Cases and extra discussion.*/

        //int score = 83; // Example score, you can change this value to test

        Scanner scanner = new Scanner(System.in);         // Create a Scanner object

        System.out.println("Enter your score (0-100): ");   // Prompt the user to enter a score
        int score = scanner.nextInt(); // Read the score as an integer

        // Calculate the grade using nested ternary operators
        String grade = (score >= 90 && score <= 100) ? "A" :
                           (score >= 80 && score < 90) ? "B" :
                                   (score >= 70 && score < 80) ? "C" :
                                           (score >= 60 && score < 70) ? "D" :
                                                   (score >= 0 && score < 60) ? "F" : "Invalid score";

        // Display the grade
        System.out.println("The letter grade is: " + grade);


    }
}
