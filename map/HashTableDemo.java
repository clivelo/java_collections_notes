package map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashTableDemo {
    public static void main(String[] args) {
        // Define Hashtable with default capacity of 11 and load factor of 0.75
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>(100, 0.9f);

        // Add key/value pairs to map
        ht.put(101, "David");
        ht.put(102, "John");
        ht.put(103, "Smith");
        ht.put(104, "David");
        ht.put(102, "Mary");
        // ht.put(null, "X")  -- not allowed
        // ht.put(110, null)  -- not allowed
        System.out.println(ht);

        // Retrieve value by key
        System.out.println(ht.get(103));

        // Remove value from map
        ht.remove(103);
        System.out.println(ht);

        // Check if key or value exists in map
        System.out.println(ht.containsKey(102));
        System.out.println(ht.containsKey(111));
        System.out.println(ht.containsValue("David"));
        System.out.println(ht.containsValue("Peter"));

        // Check if map is empty
        System.out.println(ht.isEmpty());

        // Get all keys
        System.out.println(ht.keySet());

        // Get all values
        System.out.println(ht.values());

        // Get all entries
        System.out.println(ht.entrySet());

        // Display entries using the Entry interface
        Collection<Entry<Integer, String>> entries = ht.entrySet();
        for (Entry<Integer, String> e: entries) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // iterator()
        Iterator it = ht.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, String> e = (Entry) it.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}