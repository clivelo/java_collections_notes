# Map Interface

### Characteristics
1) Represented by Key-Value object pairs
2) No duplicated Keys

### Methods
1) put(key, value)
2) putAll(Map m)
3) get(key)
4) remove(key)
5) containsKey(key)
6) containsValue(value)
7) isEmpty()
8) size()
9) clear()
10) keySet()
11) values()
12) entrySet()

### Concrete Implementations
- HashMap
    - Non-synchronized
    - Multiple threads allowed
    - Not thread-safe
    - Performance faster
    - One null key accepted, many null values accepted
- HashTable (legacy)
    - Synchronized (thread-safe)
    - One thread at a time
    - Thread-safe
    - Performance slower
    - No null keys accepted, no null values accepted
- LinkedHashMap