import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// exercise where we declare an array of String elements than put than insert that array of items into an ArrayList to sort using Collections.sort()
public class SortArrayListOfArrays {

    public static void main(String[] args) {

        String [] arr = {"word", "of", "the", "day"};


        // use the asList method from the Arrays class to insert the items in arr into arrList
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        // use the sort method from the Collections interface to sort arrList
        // is Collections referring to the Collections API or is this Collections interface something different
        Collections.sort(arrList);

        // ArrayList sorts String objects in alphabetical order"
        System.out.println("List of items after bering sorted: \n" + arrList);




    }
}
