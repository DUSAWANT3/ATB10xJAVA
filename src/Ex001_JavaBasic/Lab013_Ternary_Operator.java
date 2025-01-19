package Ex001_JavaBasic;

public class Lab013_Ternary_Operator {
    public static void main(String[] args) {
        //find the mximium  no between two no
        //X and Y --> x,y--> Ternary op.
        int x =10, y = 20;
        int max = x > y  ? x : y;
        String max1 =x > y  ? "x is max " : "Y is max";
        System.out.println(max);
        System.out.println(max1);


  //find out Even odd no
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        String result1 = (num % 2 == 0) ? (num + "  Even") : (num + "  Odd") ;
        System.out.println(result);
        System.out.println(result1);



    }
}
