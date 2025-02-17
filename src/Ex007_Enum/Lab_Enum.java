package Ex007_Enum;

import java.sql.SQLOutput;

public class Lab_Enum {
    public static void main(String[] args) {
        //An enum (enumeration) in Java is a special data type that defines a fixed set of constants.
        // It is used to represent a group of predefined values (like days of the week, colors, directions, etc.).
        System.out.println(Day.SUNDAY);
    }
}

//Constants List
     enum Day {
         SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
     }

     /*
     Key Features of Enum
✅ Enums are implicitly final and static.
✅ They can have constructors, fields, and methods.
✅ They are type-safe (prevent invalid values).
✅ Used in switch cases and collections.
      */