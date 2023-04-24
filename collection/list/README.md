# List Interface

### Characteristics
1) List implements the Collection Interface
2) Insertion order is preserved
3) Duplicates allowed

### Methods
1) add(int index, Object o)
2) addAll(int index, Collection c)
3) remove(int index)
4) get(int index)
5) set(int index, Object o)

### Implementations
- ArrayList
    - Fast retrieval
    - Slow insertion/deletion
- LinkedList (also implements Deque Interface)
    - Slow retrieval
    - Fast insertion/deletion
- Vector (Legacy) <- Stack