package Ex001_JavaBasic;

public class Lab16_Pratics {
    public static void main(String[] args) {

   //Find max noumber betwwwn two numbers
        int x =26 , y =43;

        int max = x > y ? x : y ;
        System.out.println(max);
        System.out.println(x > y ? "max no x =  "+x : "max no y =  "+y);

   //find even odd num using tenary operater
        System.out.println( (x%2==0) ? "x is Even number" : "x is Odd number");
        System.out.println( (y%2==0) ? "y is Even number" : "y is Odd number");

   // Find maximun number betweeen three numbers (usse nested ternary operater)
      int a=20, b=30, c=50;
      int max1 = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println(max1);

        String max2 = a>b ? (a>c ? a+" a is max" : c+" c is max") : (b>c ? b+" b is max" : c+" c is max");
        System.out.println(max2);


    }
}
