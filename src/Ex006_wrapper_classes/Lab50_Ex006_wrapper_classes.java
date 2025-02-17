package Ex006_wrapper_classes;

public class Lab50_Ex006_wrapper_classes {

    public static void main(String[] args) {
// Wrapper classes in Java are used to convert primitive data types into objects.

        int a = 10; //Primitive data type

        Integer num1 = Integer.valueOf(a); //Unboxing (manualy convert)

        Integer num2  = a ; //Autoboxing–Automatic conversion of primitive types into their corresponding wrapper objects.

        System.out.println("Manual Boxing: " + num1);
        System.out.println("Autoboxing: " + num2);

        //Integer num3 = Integer.valueOf(a : 10);
        Integer num3 = Integer.valueOf(a);
        int obj1 = num3.intValue();  //// Manual Unboxing

        //AutoUnboxing – Automatic conversion of wrapper objects back to primitive types
        Integer num4  = 40;
        int obj2 = num4;

        System.out.println("Manual Unboxing: " + obj1);
        System.out.println("Auto-unboxing: " + obj2);

        //Utility Methods – Wrapper classes provide useful methods like:
        int value = Integer.parseInt("100"); // Convert String to int
        String str = Integer.toString(50);   // Convert int to String
    }
}
