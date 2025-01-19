package Ex001_JavaBasic;

public class Lab015_Task1901 {
    public static void main(String[] args) {
       // 1-->Finding the Largest of Three Numbers a,b,c using the Ternary Operator.

        int p =30, q=67, r=90;
           int largestNo = (p > q) ? ((q >= r) ? q : r) : ((q >= r) ? q : r);

        System.out.println("Largest Number =  " + largestNo);

//2 --
        int a = 10;
        System.out.println(++a + a++ + a++);//11 + 11+ 12 = 34
        System.out.println(a); //13

 //3 --
        int b = 20;
        System.out.println(--b + b++ + b--); //19 + 19 + 20= 58
        System.out.println(b); //19

//4 --CLI -Command line input
      //  Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        int userinput1 = Integer.parseInt(args[0]);
        int userinput2 = Integer.parseInt(args[1]);
        System.out.println("userinput1  = " +userinput1  +  "   userinput2 =  " + userinput2);

        int max = (userinput1 > userinput2) ? userinput1 : userinput2;
        System.out.println("Max No =  " + max);

 // Take a user input - Name, Age and Salary and print them in the end.

        String userName = args[5]; // Store the input
        int userAge = Integer.parseInt(args[3]);
        int userSalary = Integer.parseInt(args[4]);

        System.out.println("User Input: " + args[2]);  // Raj
        System.out.println(userName);                  // RAM
        System.out.println("User Age =  " +userAge);  //20
        System.out.println("User Salary =  " + userSalary); //500

    }
}
