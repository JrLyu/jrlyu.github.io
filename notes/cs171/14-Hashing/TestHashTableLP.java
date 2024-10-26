public class TestHashTableLP {
    public static void main(String[] args) {
        Dictionary<Object, Object> H = new HashTableLP<>(5);

        System.out.println("Hash Table: \n" + H);
        H.put("ice", "cold");
        H.put("fire", "hot");
        H.put("rock", "hard");
        H.put("wool", "soft");
        H.put("sun", "hot");
        System.out.println("Hash Table: \n" + H);

        System.out.println("------ Test remove() ------");
        System.out.println("-- rock:" + H.remove("rock"));
        System.out.println("Hash Table: \n" + H);
        System.out.println("-- ice:" + H.remove("ice"));
        System.out.println("Hash Table: \n" + H);
        System.out.println("-- wool:" + H.remove("wool"));
        System.out.println("Hash Table: \n" + H);

        System.out.println("------ Test get() ------"); // Search skips AVAILABLE
        System.out.println("get(sun): " + H.get("sun"));
        System.out.println("get(fire): " + H.get("fire"));
        System.out.println("get(abc): " + H.get("abc"));

        System.out.println("------ Test put() ------");  // Re-use AVAILABLE
        H.put("ice", "** cold **");
        System.out.println("Hash Table: \n" + H);
        H.put("sun", "** bright **");
        System.out.println("Hash Table: \n" + H);
        System.out.println("get(sun): " + H.get("sun"));
    }
}
