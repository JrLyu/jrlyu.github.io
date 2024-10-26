public class HashTableLinProbeWoRemove<K,V> {
    // Make Entry an inner class of ArrayMap
    private class Entry<K,V> {
        private K key;   // The key (to loop up)
        private V value; // The value (corresponding to the key)
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
    public HashTableLinProbeWoRemove(int M) {  // Create a hash table of size M
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
    public int size() {
        return NItems;
    }

    public void put(K k, V v) {
        int hashIdx = hashValue(k); // Find the hash index for key k
        int i = hashIdx;
        do {
            if (bucket[i] == null) { // Is entry empty ?
                bucket[i] = new Entry<>(k,v);
                return;
            } else if (bucket[i].key == k) { // Does entry contains key k ?
                bucket[i].value = v;
                return;
            }
            i = (i + 1) % capacity;  // Check in next hash table entry
        } while (i != hashIdx); // All entries searched !
        System.out.println("Full"); // The whole table is full -- rarely happened.
    }

    public V get(K k) {
        int hashIdx = hashValue(k); // Find the hash index for key k
        int i = hashIdx;

        do {
            if (bucket[i] == null ) { // Is entry empty ?
                return null;   // NOT found
            }
            else if (bucket[i].key == k ) { // FOUND
                return bucket[i].value;
            }
            i = (i + 1) % capacity;  // Check in next hash table entry
        } while (i != hashIdx);
        return null;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == null) {
                s += i + ": " + "[NULL]" + "\n";
            } else {
                s = s + i + ": " + bucket[i].toString() + "\n";
            }
        }
        return s;
    }
}
