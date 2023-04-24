package collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Define empty PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // Add elements to queue
        pq.add(5);
        pq.add(3);
        pq.add(1);
        pq.offer(5);
        pq.offer(9);
        System.out.println(pq);

        // Get head element
        System.out.println(pq.element());
        System.out.println(pq.peek());

        // Get and remove head element;
        System.out.println(pq.remove());
        System.out.println(pq.poll());

        // Traverse PriorityQueue
        // 1) for..each loop
        System.out.println(pq);
        for (Object o: pq) {
            System.out.println(o);
        }

        // 2) iterator()
        System.out.println(pq);
        Iterator it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}