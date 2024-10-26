public class HashTableSC<K,V> implements Dictionary<K, V> {
    // Start of the inner class Entry (containing a linked field)
    private class Entry<K,V> {
        private K key;     // Key
        private V value;   // Value
        private Entry<K,V> next; // Link to create a linked list
        public Entry(K k, V v) { // Constructor
            key = k;
            value = v;
        }
        public K getKey() { // Accessor method for the key
            return key;
        }
        public V getValue() {  // Accessor method for the value
            return value;
        }
        public void setValue(V value) {         // Mutator method for the value
            this.value = value;
        }
        public String toString() {
            return "(" + key + "," + value + ")";
        }
    } // End of the inner class

    public Entry<K,V>[] bucket; // The Hash table
    public int capacity;        // capacity == bucket.length
    int    NItems;              // # items in hash table
    // MAD formula: ( Math.abs(a * HashCode + b) % p ) % M
    public int MAD_p;           // Prime number in the Multiply Add Divide alg
    public int MAD_a;           // Multiplier   in the Multiply Add Divide alg
    public int MAD_b;           // Offset       in the Multiply Add Divide alg

    // Constructor
    public HashTableSC(int M) {  // Create a hash table of size M
        bucket = (Entry[]) new Entry[M]; // Create a hash table of size M
        capacity = bucket.length;        // Capacity of this hash table
        NItems = 0;                      // # items in hash table

        MAD_p = 109345121;               // We pick this prime number...
        MAD_a = 123;                     // a = non-zero random number
        MAD_b = 456;                     // b = random number
    }

    // The hash function for the hash table
    public int hashValue(K key) {
        int x = key.hashCode(); // Uses Object.hashCode()
        return ((Math.abs(x*MAD_a + MAD_b) % MAD_p) % capacity);
    }

    // a helper method to find the dictionary entry that contains a specific key
    // it finds the Entry containing key in hash table
    // Returns Entry object containing key if found
    // Returns null if not found
    public Entry<K,V> findEntry(K k) {
        int hashIdx = hashValue(k);     // Get hash index using key k
        Entry<K,V> curr = bucket[hashIdx]; // curr = first of linked list
        while (curr != null) {
            if (curr.key.equals(k)) {
                return curr;
            }
            curr = curr.next;
        }
        // Not found
        return null;
    }
    @Override
    public int size() {
        return NItems;
    }

    @Override
    public void put(K k, V v) {
        int hashIdx = hashValue(k);
        Entry<K,V> h = findEntry(k);
        if (h != null) { // found
            h.value = v; // update
        } else { // not found
            // Add newEntry as first element in list at bucket[hashIdx]
            Entry<K,V> newEntry = new Entry<>(k, v); // make a new entry
            newEntry.next = bucket[hashIdx]; // point to the first item in the bucket
            bucket[hashIdx] = newEntry; // make new entry as the first
            NItems++;
        }
    }

    @Override
    public V get(K k) {
        Entry<K,V> h = findEntry(k);
        if (h != null) { // found
            return h.getValue();
        } else { // not found
            return null;
        }
    }

    @Override
    public V remove(K k) {
        int hashIdx = hashValue(k);
        // General case delete from linked list
        Entry<K,V> previous = bucket[hashIdx];
        Entry<K,V> current  = bucket[hashIdx];
        while (current != null && !current.key.equals(k) ) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            previous.next = current.next; // Unlink current
            NItems--;                     // Accounting...
            return current.value;         // Return value
        }
        return null; // not found
    }

    // Return string representing item in hash bucket e
    public String toString(Entry e) {
        String out = "";
        while (e != null) {
            out = out + " " + e.toString();
            e = e.next;
        }
        return out;
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < bucket.length; i++) {
            s = s + i + ": " + toString(bucket[i]) + "\n";
        }
        return s;
    }
}
