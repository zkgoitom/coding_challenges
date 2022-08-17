import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortArrayListBySize {
    public static void main (String [] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Goku");
        arrList.add("Vegeta");
        arrList.add("Gohan");
        arrList.add("Picollo");

        Comparator<String> sizeComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Collections.sort(arrList, sizeComparator);

        System.out.println("objects are sorted according to size: \n" + arrList);


        System.out.println("\n");
       // sorts objects by length and in ascending order
        arrList.sort(Comparator.comparing(String::length));
        System.out.println(arrList);

        System.out.println("\n");

        //sorts objects by length and in descending order
        arrList.sort(Comparator.comparing(String::length).reversed());

        System.out.println("objects are sorted according to size in descending order: \n" + arrList);

    }

}
// https://www.faqcode4u.com/faq/649345/how-to-sort-an-arraylist-by-its-elements-size-in-java