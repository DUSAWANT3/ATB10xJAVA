package Ex001_JavaBasic;

public class Lab008_Interview {
    public static void main(String[] args) {
        //Write a program to find if a number is even or odd using operators.
        int num = 15;
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        //   Write a program to swap two numbers without using a third variable.
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        System.out.println("After swap: a = " + a + ", b = " + b);

  // Find the maximum of three numbers using the ternary operator.
        int d = 10, e = 20, c = 15;
        int max = (d > e) ? (d > c ? d : c) : (e > c ? e : c);
        System.out.println("The maximum is: " + max);
    }
}
