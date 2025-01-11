package Ex001_JavaBasic;

public class Lab05_Constants {

    public static final double TAX_RATE = 0.18;

    public static void main(String[] args) {
        final int a =10;
      //  a=10; not possible ro change value

        System.out.println(a);
      //constants are fixed values that never change during the program's execution.
        // Once you assign a value to a constant, it cannot be modified. We use the "final" keyword to define a constant.

        // Price of a product
        double productPrice = 150.0;

        // Calculate tax
        double tax = productPrice * TAX_RATE;

        System.out.println("Product Price: Rs." + productPrice);
        System.out.println("Tax Amount: Rs." + tax);
  //In real life, constants make your code cleaner, safer, and easier to maintain!

    }
}
