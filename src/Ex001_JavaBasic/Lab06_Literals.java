package Ex001_JavaBasic;

public class Lab06_Literals {
    public static void main(String[] args) {

 // "literals" are fixed values assigned to variables directly in the code.
        // They represent constant values of various types.
  //Integer Literals
      //  Represents whole numbers.
        int decimal = 10;    // Decimal (base 10)
        int octal = 012;     // Octal (base 8, starts with 0)
        int hex = 0xA;       // Hexadecimal (base 16, starts with 0x)
        int binary = 0b1010; // Binary (base 2, starts with 0b)
     //Suffix  l or L for long
        long bigNumber = 123456789L;

  //Floating-Point Literals
     //Represents decimal or fractional numbers.
        double d1 = 3.14;    // Default is double
        float f1 = 3.14f;    // Use 'f' or 'F' for float
        double d2 = 1.2e3;   // Scientific notation (1.2 × 10³)
     //Suffix f or F for float
        float pi = 3.14F;

//Character Literals  --Represents a single character enclosed in single quotes.
        char c1 = 'A';       // Single character
        char c2 = '\n';      // Escape sequence (newline)
        char c3 = '\u0041';  // Unicode (A in hexadecimal)

 //String Literals --Represents a sequence of characters enclosed in double quotes.
        String s1 = "Hello, World!";
        String s2 = "123";
        String s3 = "";       // Empty string

   //Boolean Literals ---/Represents true or false.
        boolean isJavaFun = true;
        boolean isFishTasty = false;

   //Null Literal --Represents the absence of a value for reference types.
        String str = null; // No value assigned

   //Class Literals --Represents the class object of a specific type.
        Class<?> cls = String.class;

  //Underscores in Numeric Literals (Since Java 7)  --Improves readability of large numbers.
        int million = 1_000_000; // Same as 1000000
        long creditCard = 1234_5678_9012_3456L;

    }
}
