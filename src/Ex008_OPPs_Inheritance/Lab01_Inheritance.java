package Ex008_OPPs_Inheritance;

public class Lab01_Inheritance {
    public static void main(String[] args) {
        Triangle t1 =new Triangle();
        t1.color = "RED";
    }
}

class Shape{
    String color;
}

class Triangle extends Shape{

}
