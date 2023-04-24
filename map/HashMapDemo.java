package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        // Define HashMap with specified key/value data types
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        // Add key/value pairs to map
        m.put(101, "David");
        m.put(102, "John");
        m.put(103, "Smith");
        m.put(104, "David");
        m.put(102, "Mary");
        System.out.println(m);

        // Retrieve value
        System.out.println(m.get(102));

        // Remove an entry
        m.remove(104);
        System.out.println(m);

        // Check if key and value in map
        System.out.println(m.containsKey(103));
        System.out.println(m.containsKey(110));
        System.out.println(m.containsValue("Smith"));
        System.out.println(m.containsValue("Peter"));

        // Check if map is empty
        System.out.println(m.isEmpty());

        // Return all the keys in map
        System.out.println(m.keySet());

        // Return all the values in map
        System.out.println(m.values());

        // Return all entries in map
        Collection<Entry<Integer, String>> entries = m.entrySet();
        System.out.println(entries);

        // Display entries using the Entry interface
        for (Entry<Integer, String> e: entries) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // iterator()
        Iterator it = m.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, String> e = (Entry) it.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
