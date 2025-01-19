package Ex001_JavaBasic;

import java.sql.SQLOutput;

public class Lab014_Nested_Ternary {
    public static void main(String[] args) {
        //find the largest no in lhe list
        //1- find the inputes/outputs
        //data type--int
        //23,34,10 --> 34
      int n1 = 23, n2 = 34, n3 = 10;

      int largestNo = (n1 > n2) ? ((n1 >= n3) ? n1 : n2) : ((n2 >= n3) ? n2 : n3 );
        System.out.println("Largest number " + largestNo);

        int a= 20, b=60 , c= 40; //print large no

        int result = (a > b) ? ((a>=c)? a : c) : ((b >= c)? b : c);
        System.out.println("Largest number  " +  result) ;

    }
}
