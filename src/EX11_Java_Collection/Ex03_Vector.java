package EX11_Java_Collection;

import java.util.List;
import java.util.Vector;

public class Ex03_Vector {
    public static void main(String[] args) {
        //Vector - Avoid Vector unless thread safety is absolutely required
        // (even then, use Collections.synchronizedList() or CopyOnWriteArrayList instead).
        //•	When Use Vector  -Almost never in modern Java.

        List<String> list = new Vector<>();
        list.add("Apple");
        list.add("Orange");

        System.out.println(list);//[Apple, Orange]
    }
}
