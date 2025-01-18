package Ex001_JavaBasic;

public class Lab009_Interview2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b); // 30  --Math

        String name1 = "Raj";
        String name2 = "Sham";
        System.out.println(name1+name2); // RajSham---Concatenation
        // + -> behave differently with the data type.
        // + -> operator overloading

        System.out.println(name1 + name2 + a + b); // RajSham1020- first operator - + performed as Concatenation

        System.out.println(a + b + name1 + name2);// First + math -> 30RamSham

        System.out.println(name1 + name2 + (a + b));//RamSham30
        // BODMAS - Bracket of Div, mul, add, sub

        System.out.println((9 * 3 / 9 + 1) * 3);
        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12

        System.out.println(!(10>20)); //!(False)= True
       // System.out.println((30>90)!); //Error
        System.out.println(!!!!(30>90));// False

        // || - OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);



        int balaji_salary = 12;
        boolean x = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(x);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false






    }
}
