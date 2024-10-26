public class TestHasTableLinProbeWoRemove {
    public static void main(String[] args) {
        HashTableLinProbeWoRemove<String, String> H = new HashTableLinProbeWoRemove<>(5);

        System.out.println("Hash Table: \n" + H);
        H.put("ice", "cold");
        System.out.println("Hash Table: \n" + H);
        H.put("fire", "hot");
        System.out.println("Hash Table: \n" + H);
        H.put("rock", "hard");
        System.out.println("Hash Table: \n" + H);
        H.put("wool", "soft");
        System.out.println("Hash Table: \n" + H);
        H.put("sun", "hot");
        System.out.println("Hash Table: \n" + H);
        H.put("sun", "**bright**");    // Updates
        System.out.println("Hash Table: \n" + H);
        H.put("moon", "shine");        // *** Full ***

        System.out.println("\n**** Test get(): ****");
        System.out.println("ice:" + H.get("ice"));
        System.out.println("sun:" + H.get("sun"));
        System.out.println("abc:" + H.get("abc"));    // Not found
    }
}
