package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // Define an empty HashSet with default capacity of 16 and load factor of 0.75
        HashSet hs1 = new HashSet();

        // Define an empty HashSet with custom capacity and load factor
        HashSet<Integer> hs2 = new HashSet<Integer>(100, 0.9f);

        // Add element into set
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);
        hs2.add(3);
        System.out.println(hs2);

        // Remove element from set
        hs2.remove(5);
        System.out.println(hs2);

        // Check if element in set
        System.out.println(hs2.contains(3));
        System.out.println(hs2.contains(5));

        // Check if set is empty
        System.out.println(hs2.isEmpty());

        // Traversing HashSet
        // 1) for..each loop
        System.out.println(hs2);
        for (Object e: hs2) {
            System.out.println(e);
        }

        // 2) iterator()
        System.out.println(hs2);
        Iterator it = hs2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Union
        HashSet<Integer> hs3 = new HashSet<Integer>();
        hs3.add(2);
        hs3.add(3);
        
        hs2.addAll(hs3);
        System.out.println(hs2);

        // Intersection
        hs2.retainAll(hs3);
        System.out.println(hs2);

        // Difference
        hs2.add(1);
        hs2.add(4);
        hs2.removeAll(hs3);
        System.out.println(hs2);

        // Subset
        hs2.add(2);
        hs2.add(3);
        System.out.println(hs2.containsAll(hs3));
    }
}
