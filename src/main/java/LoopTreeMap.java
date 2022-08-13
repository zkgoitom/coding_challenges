import java.util.Map;
import java.util.TreeMap;

public class LoopTreeMap {
    public static void main (String [] args) {
        Map<String, String> treemap = new TreeMap<>();

        treemap.put("Incompetent", "clown");
        treemap.put("Dumb", "fuck");
        treemap.put("Nincompoop", "Poser");
        treemap.put("Self-loathing", "hack");

        System.out.println(treemap);

        System.out.println("\n");

        for (String tree : treemap.keySet()) {
            System.out.println("Keys: " + tree + " values: " + treemap.get(tree));
        }

        Map<String, Integer> tmap = new TreeMap<>();

        System.out.println("\n");

        tmap.put("informational", new Integer(100));
        tmap.put("successful", new Integer(200));
        tmap.put("redirections", new Integer(300));
        tmap.put("client-error", new Integer(400));
        tmap.put("server-error", new Integer(500));

        // notice you don't have to use "<String, Integer>" to identify the data types of the key, value
        for (Map.Entry tm : tmap.entrySet()) { // treemap sorts the pairs according to the alphabetical order of the keys
            System.out.print(tm.getKey() + ":");
            System.out.println(tm.getValue());
        }

        // change a value by passing arguments to put()
        // the first argument is the name of the key that is tied to the value you wish to change
        // the 2nd argument passed is the new value to take the place of the old value

        System.out.println("\n");

        tmap.put("server-error", 501);

        System.out.println(tmap);

        // removing by passing the key name of the key-value pair you wish to remove to remove()
        System.out.println("\n");

        tmap.remove("server-error");
        System.out.println(tmap);


    }

}
