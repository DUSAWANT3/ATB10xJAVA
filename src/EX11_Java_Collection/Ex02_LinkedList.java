package EX11_Java_Collection;

import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {
    public static void main(String[] args) {
        //LinkedList -Use LinkedList when you frequently insert or delete elements.

        LinkedList<String> a = new LinkedList<String>();
           //Here you're directly using the LinkedList class.
           //This is fine if you want access to LinkedList-specific methods like:
           //addFirst(), addLast(), removeFirst(), removeLast()

        List<String> list = new LinkedList<String>();
        //List is an interface, and you're using LinkedList as its implementation.
        //Good practic --It allows flexibility to switch to ArrayList, Vector, etc., later.
        list.add("Banana");
        list.add("apple");

        System.out.println(list);//[Banana, apple]

        List<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
// This won't compile:
// list.addFirst("Z");


// This will work:
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Z");
    }
}
