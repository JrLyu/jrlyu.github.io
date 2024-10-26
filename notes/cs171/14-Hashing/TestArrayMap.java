public class TestArrayMap {
    public static void main(String[] args) {
        Dictionary<Object, Object> D = new ArrayMap<>(10);

        D.put("ice", "cold");
        D.put("fire", "hot");
        System.out.println("\n------ Test get() ------");
        System.out.println("ice:" + D.get("ice"));
        System.out.println("fire:" +D.get("fire"));
        System.out.println("\n------ Test size() ------");
        System.out.println("size:" + D.size());
        D.put("rock", "hard");
        D.put("wool", "soft");
        System.out.println("\n------ Test put() ------");
        System.out.println("sun:" +D.get("sun"));
        D.put("sun", "hot");
        System.out.println("sun:" +D.get("sun"));
        D.put("sun", "**bright**");   // Update !
        System.out.println("sun:" +D.get("sun"));
        D.put("moon", "shine");

        Dictionary<Object, Object> H = new ArrayMap<>(10);

        H.put("ice", "cold");
        H.put("fire", "hot");
        H.put("rock", "hard");
        H.put("wool", "soft");
        H.put("sun", "hot");

        System.out.println("\nInitial hash table:");
        System.out.print(H);
        System.out.println("#Items = " + H.size() + "\n\n");

        System.out.println("\n------ Test remove() ------");
        System.out.println("-- ice:" + H.remove("ice"));
        System.out.print(H);
        System.out.println("#Items = " + H.size() + "\n");
        System.out.println("-- fire:" + H.remove("fire"));
        System.out.print(H);
        System.out.println("#Items = " + H.size() + "\n");
        System.out.println("-- sun:" + H.remove("sun"));
        System.out.print(H);
        System.out.println("#Items = " + H.size() + "\n");
    }
}
