package Ex001_JavaBasic;

public class Lab011_Casting {
    public static void main(String[] args) {
        //casting refers to the process of converting one data type into another. There are two main types of casting:
        // primitive type casting (used for primitive data types) and
        // object type casting (used for objects). Let's break it down with examples for better understanding

   //Widening Casting (Implicit)
       // Smaller data type is automatically converted into a larger data type.
              //  Happens implicitly without any explicit code.
               //No data loss occurs. byte → short → int → long → float → double
        int num = 100; // int
        double doubleNum = num; // Automatically converts int to double (widening)
        System.out.println("Int: " + num); // 100
        System.out.println("Double: " + doubleNum); // 100.0

  //Narrowing Casting (Explicit)
      //  Larger data type is explicitly converted into a smaller data type.
       //         Requires an explicit cast ((datatype)).
         //       Data loss or truncation may occur if the value is too large for the target data type.
        //double → float → long → int → short → byte
        double doubleNum1 = 100.99; // double
        int num1 = (int) doubleNum1; // Explicitly converts double to int (narrowing)
        System.out.println("Double: " + doubleNum1); // 100.99
        System.out.println("Int: " + num1); // 100 (fractional part lost)


    }
}
