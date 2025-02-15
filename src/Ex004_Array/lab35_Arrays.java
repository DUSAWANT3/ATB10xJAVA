package Ex004_Array;

public class lab35_Arrays {
    public static void main(String[] args) {

//Arrays -> is collection of similar type data
//Array- Index start from 0
        int[] marks ={51, 100,91, 87,90};//array creation with predefine
        System.out.println(marks.length);//length start with 1 //5
        System.out.println(marks[0]); //51
      //  System.out.println(marks[-1]);//ArrayIndexOutOfBoundsException

        for(int i=0; i <marks.length; i++){
            System.out.print(marks[i]+"  ,");
        }
        System.out.println();
//2 way to create an arrays
     String[] names = {"Durgesh", "Sawant","Amit", "Ram"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+", ");
        }

        System.out.println();// New line
 //2
       String[] name1 = new String[3]; //alwase fix size
        name1[0] = "Du";
        name1[1] = "Raj";
        name1[2] = "Ram";

        for (int i = 0; i < name1.length; i++) {
            System.out.print(name1[i] +", ");

        }

        int[] num = new int[3];
        num[0] = 9;
        num[1] = 20;
        num[2] = 30;

        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i] + " ,");
        }
    }
}
