import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescending {
    public static void main (String [] args) {

        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Bron");
        arrList.add("Kobe");
        arrList.add("Mike");

        // Collections.sort() sorts objects in ascending order, unless you pass the Collections.reverseOrder() method as the 2nd argument
        // to the Collections.sort(). invoking reverseOrder() inside sort method
        Collections.sort(arrList, Collections.reverseOrder());

        System.out.println("List of objects are in descending order: \n" + arrList);
    }
}
