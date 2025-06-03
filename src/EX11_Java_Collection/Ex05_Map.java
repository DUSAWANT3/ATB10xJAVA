package EX11_Java_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex05_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Durgesh");
        map.put(102, "Amit");
        map.put(103, "Sneha");

        System.out.println(map);            // {101=Durgesh, 102=Amit, 103=Sneha}
        System.out.println(map.get(101));   // Durgesh
        System.out.println(map.get(105));   // null

        // ✅ Corrected entrySet() + Iterator
        Set<Map.Entry<Integer, String>> sn = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = sn.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue()); //101 => Durgesh ...
        }

    }
}