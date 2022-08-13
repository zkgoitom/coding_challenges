import java.util.HashMap;
import java.util.Map;

public class LoopHashMap {

    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("Zack", "Goitom");
        hashmap.put("Alem", "Ghebre");
        hashmap.put("Dumb", "Fuck");
        hashmap.put("incompetent", "hack");

        System.out.println(hashmap);

        System.out.println("\nkeys:");
        for (String s : hashmap.keySet()) {
            System.out.println(s);
        }

        System.out.println("\n");
        for (int i = 0; i <= hashmap.size(); i++) { // the 1st line of the for loop dictates how many times
            System.out.println(hashmap.values());
        }

        System.out.println("\n");
        for (String hash : hashmap.values()) {
            System.out.println(hash);
        }

        System.out.println("\n");

        for (String hash : hashmap.keySet()) {
            System.out.println(hash + hashmap.get(hash)); // Why does the get(hash) get values but hash alone gets keys
            System.out.println("keys: " + hash + " values: " + hashmap.get(hash)); // would make more sense to me if hashmap.get was hashmap.values()
        }

        HashMap<String, Integer> integerhashmap = new HashMap<>();

        integerhashmap.put("Jordan", 1);
        integerhashmap.put("Kobe", 2);
        integerhashmap.put("Lebron", 3);

        System.out.println("\n");
        for (String hash : integerhashmap.keySet()) {
            System.out.println("keys: " + hash + " values: " + integerhashmap.get(hash));
        }

        System.out.println("\n");
        Map<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }


    }
}


//for some reason treemap wouldn't work in this class. but the exact same code copied and pasted into another class did work
    // makes me think it has to do with some kind of conflict treemap and hashmap within the same class

    /*Map<String, String> treemap = new TreeMap<>();

    treemap.put("Incompetent", "clown");
    treemap.put("Dumb", "fuck");
    treemap.put("Nincompoop", "Poser");
    treemap.put("Self-loathing", "hack");

    System.out.println(treemap);

     */






