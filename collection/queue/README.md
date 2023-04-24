# Queue Interface

### Characteristics
1) Queue implements the Collection Interface
2) Insertion order is preserved
3) Duplicates allowed
4) First-In-First-Out (FIFO)

### Methods
1) add(Object o) - returns true or raise exception
2) offer(Object o) - returns true or false
3) element() - returns head element or raise exception
4) peek() - returns head element or null
5) remove() - returns and remove head element or raise exception
6) poll() - returns and remove head element or null

### Implementations
- PriorityQueue
    - Insertion order is not preserved
    - Heterogeneous data not allowed
- LinkedList (also implements List Interface)
    - Insertion order is preserved
    - Heterogeneous data allowed
- Deque (Interface)
- BlockingQueue(Interface)
- BlockingDeque(Interface)