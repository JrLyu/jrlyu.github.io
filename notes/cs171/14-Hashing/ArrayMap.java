public class ArrayMap<K,V> implements Dictionary<K,V>{
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

    Entry<K,V>[] entry; // Dictionary
    int nEntries; // # Entries in dictionary

    public ArrayMap(int N) { // Constructor
        // Due to Java feature, we cannot create parameterized array.
        // So we will settle with unchecked data type warnings.
        entry = new Entry[N];
        nEntries = 0;
    }

    @Override
    // Return # of entries in the dictionary
    public int size() {
        return nEntries;
    }

    @Override
    // Insert (k,v) if k not in dictionary. Otherwise, update v for key k
    public void put(K k, V v) {
        for (int i = 0; i < nEntries; i++) {
            if (entry[i].getKey().equals(k)) {
                // Found key
                entry[i].setValue(v);   // update the value
                return;
            }
        }
        // Key not found
        entry[nEntries] = new Entry<K,V>(k,v); // insert (K,V)
        nEntries++;
    }

    @Override
    // Returns the value v for key k. Return null if k not in dictionary
    public V get(K k) {
        for (int i = 0; i < nEntries; i++) {
            if (entry[i].getKey().equals(k)) {
                // Found key
                return entry[i].getValue();
            }
        }
        // Key not found
        return null;
    }

    @Override
    // Remove entry (k, v) from dictionary. Return v when k found. Otherwise return null
    public V remove(K k) {
        boolean found = false; // Indicate key not found
        int loc = -1;          // Contains index of key
        V   ret = null;        // Contain the return value (default = null)

        for (int i = 0; i < nEntries; i++) {
            if (entry[i].getKey().equals(k)) {
                found = true;  // Indicates key k was found
                loc = i;       // Remember the index of the entry
                break;
            }
        }
        if (found) {
            ret = entry[loc].getValue();   // Update return value
            for (int i = loc+1; i < nEntries; i++) {  // Delete entry [loc]
                entry[i - 1] = entry[i];    // Shift array
            }
            nEntries--;
        }
        return ret;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < nEntries; i++) {
            s += "[" + i + "]: " + entry[i].toString() + "\n";
        }
        return s;
    }
}
