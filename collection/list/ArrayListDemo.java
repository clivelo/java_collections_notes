package collection.list;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Define an empty ArrayList with default allocation of 10 elements of any data type
        ArrayList al1 = new ArrayList();

        // Define an empty ArrayList with default allocation of 10 elements of specific data type
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        // Add a single object to the ArrayList
        al1.add("remove this");
        System.out.println(al1);

        // Add a single object at the specified index
        al1.add(0, "insert");
        System.out.println(al1);

        // Find size of the ArrayList
        System.out.println(al1.size());

        // Remove a single object in the ArrayList
        al1.remove(1);
        System.out.println(al1);

        // Get the element at the specified index
        System.out.println(al1.get(0));

        // Set the element at the specified index with a new value
        al1.set(0, "new value");
        System.out.println(al1);

        // Check if element in ArrayList
        System.out.println(al1.contains("new value"));
        System.out.println(al1.contains("does not exist"));

        // Check if ArrayList is empty
        System.out.println(al1.isEmpty());

        // Add some elements to the integer ArrayList and sort the elements
        al2.addAll(Arrays.asList(4, 7, 1, 5, 2));
        Collections.sort(al2);
        System.out.println(al2);
        // Sorting in reverse
        Collections.sort(al2, Collections.reverseOrder());
        System.out.println(al2);

        // Shuffle ArrayList
        Collections.shuffle(al2);
        System.out.println(al2);

        // Traverse ArrayList
        // 1) for loop
        System.out.println(al2);
        for (int i = 0; i < al2.size(); i++) {
            System.out.println(al2.get(i));
        }

        // 2) for..each loop
        System.out.println(al2);
        for (Object e: al2) {
            System.out.println(e);
        }

        // 3) iterator()
        System.out.println(al2);
        Iterator it = al2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
