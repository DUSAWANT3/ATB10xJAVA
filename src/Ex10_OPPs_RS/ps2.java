package Ex10_OPPs_RS;

public class ps2 extends ps3 {
    int a;

    public ps2(int a) {
        super(a);
        this.a =a; //Parameterized Constructor
    }

    public int increment(){
        a =a+1;
        return a;
    }

    public int decrement(){
        a =a - 1;
        return a;
    }
}
