package Ex10_OPPs_RS;

public class PS1 extends PS{
    public static void main(String[] args) {
        PS ps = new PS();
        ps.doThis();

        int a = 3;

        ps2 ps2 = new ps2(a); //Constructor
        System.out.println(ps2.increment());
        System.out.println(ps2.decrement());

        System.out.println(ps2.multipalBy2());
        System.out.println(ps2.multipalBy3());
    }

}
//extends
//Inheritance allows a class (called a subclass or child class) to acquire fields and methods from another class
// (called a superclass or parent class). It's like a family tree — the child inherits the traits of the parent.