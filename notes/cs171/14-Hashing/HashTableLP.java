public class HashTableLP<K,V> implements Dictionary<K,V> {
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
    public Entry AVAILABLE;

    // Constructor
    public HashTableLP(int M) {  // Create a hash table of size M
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
        int firstAvail = -1; // -1 means: no AVAILABLE entry found (yet).

        do { // search or key k in the hash table
            if (bucket[i] == null) { // Is entry empty ?
                if ( firstAvail == -1 ) {  // No AVAILABLE bucket found
                    bucket[i] = new Entry<>(k, v); // Insert (k,v) in this empty bucket
                } else { // An AVAILABLE bucket found
                    bucket[firstAvail] = new Entry<>(k, v);
                }
                return;
            } else if (bucket[i].key == AVAILABLE) {
                if (firstAvail == -1) {
                    firstAvail = i;
                }
            } else if (bucket[i].key == k) { // Does entry contains key k ?
                bucket[i].value = v;
                return;
            }
            i = (i + 1) % capacity;  // Check in next hash table entry
        } while (i != hashIdx); // All entries searched !
        if (firstAvail == -1) {
            System.out.println("Full"); // The whole table is full -- rarely happened.
        } else {
            bucket[firstAvail] = new Entry<>(k,v);
        }
    }

    public V get(K k) {
        int hashIdx = hashValue(k); // Find the hash index for key k
        int i = hashIdx;

        do {
            if (bucket[i] == null ) { // Is entry empty ?
                return null;   // NOT found
            } else if (bucket[i] == AVAILABLE) {
                // Do nothing and continue
            } else if (bucket[i].key == k ) { // FOUND
                return bucket[i].value;
            }
            i = (i + 1) % capacity;  // Check in next hash table entry
        } while (i != hashIdx);
        return null;
    }

    @Override
    public V remove(K k) { // Return the value associated with key k
        int hashIdx = hashValue(k);
        int i = hashIdx;

        do {
            if (bucket[i] == null) { // Is bucket empty ?
                return null;       // Key k is not in hash table
            }
            else if (bucket[i] == AVAILABLE) {
                // DO NOT TEST bucket[i] !!! But we need to continue...
                continue;
            } else if (bucket[i].key == k ) { // Does bucket contains key k ?
                V retVal = bucket[i].value;
                bucket[i] = AVAILABLE;    // Delete the entry
                return retVal;            // Return value
            }
            i = (i + 1)%capacity;  // Check in next hash table bucket
        } while (i != hashIdx); // All entries searched !

        return null;  // Not found
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == null) {
                s += i + ": " + "[NULL]" + "\n";
            } else if (bucket[i] == AVAILABLE) {
                s += i + ": " + "[AVAILABLE]" + "\n";
            } else {
                s = s + i + ": " + bucket[i].toString() + "\n";
            }
        }
        return s;
    }


}
