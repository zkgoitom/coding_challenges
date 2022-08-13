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


    }

}
