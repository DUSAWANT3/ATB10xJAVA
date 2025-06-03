package EX11_Java_Collection;

import java.util.ArrayList;

public class Ex01_List_ArrayList {
    public static void main(String[] args) {
        //LIST --maintain the order of insertion --duplicate elements are allowed
        //ARRAYLIST
        ArrayList<String> a = new ArrayList<String>();
        a.add("Apple");
        a.add("Banana");
        a.add("Mango");
        a.add("Apple"); //duplicate elements are allowed in list
        System.out.println(a); //[Apple, Banana, Mango, Apple]

        a.add(1,"Orange"); //In between also we can add the element
        System.out.println(a); //[Apple, Orange, Banana, Mango, Apple]

        //a.remove(0); //It removes the element
        //System.out.println(a); //[Orange, Banana, Mango, Apple]

        System.out.println(a.get(3)); //Mango

        System.out.println(a.contains("Cherry"));//false

        for(String b : a){ //Print all the element one by one
            System.out.println(b);
        }
    }
}
