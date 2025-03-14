package Ex001_JavaBasic;

import java.sql.SQLOutput;

public class Lab04_Variable {
    public static void main(String[] args) {
        System.out.println("Class2 11th Jan 20225");

        int a = 10;
        //data type variable_name = variable_value
        // int -> primitive -data type- numaric value
        //it store the whole number-without any decimal point
        int age = 25;
        age = 1 + age;
        age = 25;
                 //age -> variable name or Identifier
        System.out.println(age);

  //byte -128 to 127 (circular)
        byte b = 127;

//Print F
        //The printf() function is used to format and print text in Java.
        // It gives you control over how text, numbers, or other data are displayed. The name stands for "print formatted.
/* %d --> Integer (decimal)
   %f --> 	Floating-point numbers --> %.2f == 4.13
   %s --> 	String
   %c --> 	Character
   %n --> New line (like \n)
 */
        int age1 = 24;
        String name = "DU";
        System.out.printf("My name is %s, and I am %d years old.%n", name, age1);
//Example 2: Formatting Numbers
        double price = 123.456;
        System.out.printf("Price with 2 decimal places: %.2f%n", price);
        System.out.printf("Price with 1 decimal place: %.1f%n", price);

//Example 3: Aligning Output
        System.out.printf("%-10s %-10s %-10s%n", "Name", "Age", "City");
        System.out.printf("%-10s %-10d %-10s%n", "DU", 25, "Mumbai");
        System.out.printf("%-10s %-10d %-10s%n", "Raj", 30, "Delhi");

//%-10s: Left-align the string within 10 characters.
//%10d: Right-align the integer within 10 spaces.


    }
}
