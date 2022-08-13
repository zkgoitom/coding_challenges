import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// class with main driver to execute the SortingUsingComparable class
public class ComparableMain {
    public static void main (String [] args) {

        // create the ArrayList Object
        ArrayList<SortingUsingComparable> suc = new ArrayList<SortingUsingComparable>();

        // what is going on here?
        // Is the new keyword creating new objects of class SortingUsingComparable?
        // Is SortingUsingComparable constructor being invoked and arguments being passed to it?
        // looks similar to how Integer was used in the Sorting of one of the Map classes

        suc.add(new SortingUsingComparable(2018, "Kia", 20));
        suc.add(new SortingUsingComparable(2020, "MG", 13));
        suc.add(new SortingUsingComparable(2013, "creta", 10));
        suc.add(new SortingUsingComparable(2015, "BMW", 50));
        suc.add(new SortingUsingComparable(2017, "Audi", 45));

        //call the sort function
        Collections.sort(suc);

        //iterate over ArrayList using for each loop
        // is SortingUsingComparable sortingUsingComparable an object of that object type? with the 'S' one being the data type
        // and lower case one being the object? This would explain it having the same name as the class and also explain how in the
        // print statement inside the block sortingUsingComparable can use dot notation to access the variables of the class.
        // only objects/class use dot notation to give access to the data members of the object/class? or what?
        for (SortingUsingComparable sortingUsingComparable : suc) {

            // print the sorted ArrayList
            // use dot notation to access the methods data members of the class?
            // use dot notation to access the objects of the list?
            // what's going on here?
            System.out.println(sortingUsingComparable.ModalNo + " " + sortingUsingComparable.name + " " + sortingUsingComparable.stock);
        }
    }
}
