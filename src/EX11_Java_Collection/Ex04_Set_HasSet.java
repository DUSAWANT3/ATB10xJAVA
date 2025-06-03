package EX11_Java_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex04_Set_HasSet {
    public static void main(String[] args) {
        //Set --No Duplicate no Maintain Order
        // HashSet, LinkedHashSet, TreeSet.
        //HashSet
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate, ignored
        set.add("Orange");

        System.out.println(set); // Order is not guaranteed Element stored in random order [Apple, Banana]
        System.out.println(set.size());//2

        //Iterator
        Iterator<String> i = set.iterator();
        //i.next();
        while (i.hasNext()){  //hasNext -Returns true if more elements exist
            System.out.println(i.next()); //Returns the next element
        }

        while (i.hasNext()) {
            if (i.next().equals("Orange")) {
                i.remove();  // ✅ safe removal
            }
        }

    }
}
