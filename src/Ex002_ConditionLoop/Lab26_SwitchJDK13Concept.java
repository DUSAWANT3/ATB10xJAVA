package Ex002_ConditionLoop;

public class Lab26_SwitchJDK13Concept {
    public static void main(String[] args) {
        int code =003 ;
        //Using Switch we can give the multipal condotion in 1 case
        //This concept mostly us in Web automation

        switch(code){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,003:
                System.out.println("This is Match");
                break;
            case 007:
                System.out.println("NA");
                break;
        }
  //lamday
        switch (code){
            case 003 -> System.out.println("This is Match");
            case 010 -> System.out.println("NA");
            //-> work as a break
        }
    }
}
