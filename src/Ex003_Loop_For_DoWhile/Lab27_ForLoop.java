package Ex003_Loop_For_DoWhile;

public class Lab27_ForLoop {
    public static void main(String[] args) {
        /*Loop -> Repeat a block of code
       for(I ; C ; U)
       I-Initialization, C- Condition ,U -Updation
         */
        for (int i = 0; i < 10; i++) { //10 times 0 to 9
            System.out.print(" " + i + " ");
        }
        System.out.println(); //for new line
        for (int j = 0; j <= 10; j++) { //11 times 0- to 10
            System.out.print(" " + j + " ");
        }
        System.out.println(); //for new line
        for (int k = 10; k >= 0; k--) {
            System.out.print(" " + k + " ");
        }
    }
}
