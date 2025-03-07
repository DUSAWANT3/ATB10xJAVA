package Ex008_OPPs;

public class Lab_051_Opps1 {
    public static void main(String[] args) {
     /*   Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "Red";
        pen2.type = "Ballpoint";

        pen1.printColour();
        pen2.printColour();

        pen1.write(); //call  method from clss to main object

        Student s1 = new Student();
        s1.name = "Raj";
        s1.age = 12;
         s1.printInfo();
    }
}
class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
   /* //Constructor 1- Non paramtries
    Student(){
        System.out.println("constructor called");
    } */

  /*  // Constructor 2 -Parametrise
    Student(String name, int age){
       this.name = name;
       this.age = age;
    } */

    // Constructor 3- Copy
  //  Student(Student s2){
//        this.name =s2.name;
  //      this.age = s2.age;
    }

}
/*
class Pen{  //properties
    String colour;
    String type; //ballpoint, Gel

    //Function -Method
    public void write(){
        System.out.println("Wright Something");
    }
    public void printColour(){
        System.out.println(this.colour);//this -Keyword
    }

}
*/