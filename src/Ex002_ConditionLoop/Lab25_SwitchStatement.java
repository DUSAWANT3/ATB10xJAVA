package Ex002_ConditionLoop;

import java.util.Scanner;

public class Lab25_SwitchStatement {
    public static void main(String[] args) {
        //user =enteer int number from 1 to 7
        //Which Day it is
        //1-Mon, 2-Tue, 3-thus, ---7-sun
        //if user enter -1, num > 7--Invalid Input
Scanner SC = new Scanner(System.in);
        System.out.println("Enter the day Number Between 1 to 7 = ");
int day =SC.nextInt();

switch (day){
    case 1:
        System.out.println("Mon");
        break;
    case 2:
        System.out.println("Tue");
        break;
    case 3:
        System.out.println("Wed");
        break;
    case 4:
        System.out.println("Thu");
        break;
    case 5:
        System.out.println("Fri");
        break;
    case 6:
        System.out.println("Sat");
        break;
    case 7:
        System.out.println("Sun");
        break;
    default:
        System.out.println("NA Value");
        break;
}

    }
}
