package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Define empty LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Add elements to the list
        ll.add(4);
        ll.add(7);
        ll.add(1);
        ll.add(2);
        ll.add(5);
        System.out.println(ll);

        // Find size of the list
        System.out.println(ll.size());

        // Remove index from the list
        ll.remove(2);
        System.out.println(ll);

        // Insert element in the middle of the list
        ll.add(2, 1);
        System.out.println(ll);

        // Retrieve element
        System.out.println(ll.get(2));

        // Change an element to a new value
        ll.set(0, 6);
        System.out.println(ll);

        // Check if element is in list
        System.out.println(ll.contains(6));
        System.out.println(ll.contains(10));

        // Check if list is empty
        System.out.println(ll.isEmpty());

        // Traverse LinkedList
        // 1) for loop
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        // 2) for..each loop
        System.out.println(ll);
        for (Object e: ll) {
            System.out.println(e);
        }

        // 3) iterator()
        System.out.println(ll);
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
