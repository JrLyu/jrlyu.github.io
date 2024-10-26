public interface Dictionary<K,V> {
    public int size(); // Return # of entries in the dictionary
    public void put(K k, V v); // Insert (k,v) if k not in dictionary. Otherwise, update v for key k
    public V get(K k);         // Returns the value v for key k. Return null if k not in dictionary
    public V remove(K k);      // Remove entry (k, v) from dictionary. Return v when k found. Otherwise, return null
}
