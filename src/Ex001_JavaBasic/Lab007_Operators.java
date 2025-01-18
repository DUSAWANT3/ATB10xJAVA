package Ex001_JavaBasic;

public class Lab007_Operators {

 //- An operator is a special symbol.
  //  Tells the compiler to perform specific mathematical or logical operations on **operands**.
  //   Operators are used to perform operations by using operands.(variable names) -> age


    public static void main(String[] args) {
 //1. Basic Operators
 //1.1 Arithmetic Operators --Used to perform basic arithmetic operations.
        int a = 10, b = 20;
        System.out.println(a + b); // 30- Addition
        System.out.println(b - a); // 10--Subtraction
        System.out.println(a * b); // 200--Multiplication
        System.out.println(b / a); // 2--Division
        System.out.println(b % a); // 0--Modulus (Remainder)

   //Relational (Comparison) Operators
     //Used to compare two values and return a boolean (true or false).
        System.out.println(a == b); // false--Equal to
        System.out.println(a != b); // true--Not equal to
        System.out.println(a > b);  // false--Greater than
        System.out.println(a < b);  // true--Less than
        System.out.println(a >= b); // false--Greater than or equal to
        System.out.println(a <= b); // true--Less than or equal to

//Logical Operators --Used to combine multiple boolean expressions.
   //and && . OR || . Not !
      boolean c = true, d = false;
        System.out.println(c && d); // false --And
        System.out.println(c || d); // true --OR
        System.out.println(!c);     // false-Not
//AND operator returns true if both conditions are true.
// If either condition is false, 1=T 0=F
        //   T && T = T        or T || T = T   Not !T = F
        //   T && F = F        or T || F = T       !F =T
        //   F && T = F        or F || T = T
        //   F && F = F        or F || F = F

 //Assignment Operators --Used to assign values to variables.
       // int a = 10; --- Assign Value Right to left
        a += 5; // a = a + 5 (15) --add and assign
        a -= 3; // a = a - 3 (12) --Subtract and assign
        a *= 2; // a = a * 2 (24)--Multiply and assign
        a /= 4; // a = a / 4 (6)--Divide and assign
        a %= 2; // a = a % 2 (0)-Modulus and assign
        System.out.println(a);

//2-Intermediate Operators
  //Bitwise Operators--Operate on bits and perform bit-level operations.
        int x = 5, y = 3;
        System.out.println(x & y); // 1 (0101 & 0011 = 0001)--Bitwise &
        System.out.println(x | y); // 7 (0101 | 0011 = 0111) --Bitwise OR
        System.out.println(x ^ y); // 6 (0101 ^ 0011 = 0110) --Bitwise xor
        System.out.println(~x);    // -6 (~0101 = 1010) -- Bitwise Complement
        System.out.println(x << 1); // 10 (Left shift 5 by 1 bit: 1010)--Left shift
        System.out.println(x >> 1); // 2 (Right shift 5 by 1 bit: 0010)--Right shift
        System.out.println(x >>> 1); // 2 (Same as >> for positive numbers)--Unaigned Right shift

     //Unary Operators-Used with a single operand.
        //+ Positive value , - Negetive value
        int p = 10;
        System.out.println(++p); // Pre-increment: 11--Incriment then print
        System.out.println(p++); // Post-increment: 11 (then p = 12)--print then incriment
        System.out.println(p);   //--12
        System.out.println(--p); // Pre-decrement: 11 (12-1)-decrement then print
        System.out.println(p--); // Post-decrement: 11 (then p= 10)--print and then decriment
        System.out.println(p); // 10

//Advanced Operators--
// Ternary Operator--Shortcut for if-else statement.
        // Using ternary operator to find the maximum of two numbers
        int e = 10, f = 20; //(condition) ? trueVal : falseVal
        int max = (e > f) ? e : f;// ? : -Conditional (ternary) operator
        System.out.println(max); // 20
//condition is e > f
//If condition is true, expression1 (e) is evaluated.
//If condition is false, expression2 (f) is evaluated.

  //Instanceof Operator
        //Used to test whether an object is an instance of a specific class.
        String str = "Hello";
        System.out.println(str instanceof String); // true
    }
}
