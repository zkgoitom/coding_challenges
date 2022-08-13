import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main (String [] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("mazda");
        cars.add("buick");
        cars.add("honda");
        cars.add("toyota");

        System.out.println("my list of cars unsorted: ");

        for (String i: cars) {
            System.out.println(i);
        }

        Collections.sort(cars);

        System.out.println("\nThe sort method of the Collections framework will sort my list of cars in ascending (alphabetically) order :");

        for (String i : cars) {
            System.out.println(i);
        }

        cars.add("Range Rover");

        System.out.println(cars);

        cars.set(4, "Volkswagen");

        System.out.println(cars);
    }
}
