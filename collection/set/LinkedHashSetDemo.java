package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Define an empty LinkedHashSet with capacity of 16 and load factor of 0.75
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        
        // Add elements - order preserved
        lhs.add(10);
        lhs.add(7);
        lhs.add(10);
        lhs.add(3);
        lhs.add(1);
        System.out.println(lhs);
    }
}
