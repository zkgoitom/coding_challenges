import java.util.LinkedHashMap;
import java.util.Map;

public class LoopingLinkedListHashMap {

    public static void main(String [] args) {

        Map<Integer, String> link = new LinkedHashMap<>();

        link.put(0, "fan");
        link.put(1, "computer");
        link.put(2, "projecter");

        for (Map.Entry<Integer, String> li : link.entrySet()) {

            System.out.println(li.getKey() + " " + li.getValue());
        }
    }


}
