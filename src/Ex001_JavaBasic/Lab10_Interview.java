package Ex001_JavaBasic;

public class Lab10_Interview {
    public static void main(String[] args) {

        int a = 10;
        boolean b = (10 == 11); // == -> Comparison 2 values
        System.out.println(a); //10
        System.out.println(b); // faalse

        char a1 = 'A'; // ASCII -> 65
        char b1 = 'B'; // 66
        System.out.println(a1 + b1); //AB- math= 65+66 =131

        // Rule - concatenation of Strings -> char -> int calculation
        // a1+b1 - 65+66 -> 131
        System.out.println(a1 - b1); //65-66=-1



        System.out.println('A' == 65); // == char -> ASCII - 65 =True


        short s = 10;
        char c = 'A'; //A -> 65
        System.out.println(c+s);
        System.out.println(c);
        // When you do the + concat then only ASCII values are used.

    }
}
