// implements
class SortingUsingComparable implements Comparable<SortingUsingComparable> {

    int ModalNo;
    String name;
    int stock;

    // parameterized constructor of the class
    SortingUsingComparable(int Modalno, String name, int stock) {
        this.ModalNo = Modalno;
        this.name = name;
        this.stock = stock;
    }

    //override the compareTo method of the Comparable interface
    //the custom Comparable is devised here using compareTo()
    //compareTo() will be used to sort cars according to stock. it will be in ascending order of the number
    //How is it able to do this in the ComparableMain class when it's never invoked?
    //Also what is the meaning of the condition here? What is the difference between stock and sortingUsingComparable.stock?
    // What does the return indicate? index position?
    // is the SortingUsingComparable sortingUsingComparable argument being passed representing all the stock numbers?
    // is the stock variable 1 stock ?
    // And Thus meaning, that stock one (stock) is compared to each other stock (that is added) separately (sortingUsingComparable.stock)
    // 0 will be returned if the objects are the amount. When sorting the sortMethod will take this in consideration and sort the objects
    // inserted into the ArrayList according to the differences between this object
    // 0 will tell sort() that they are equal, 1 (or anything > 0) will tell sort() that this object is smaller than the other object
    // -1 will tell sort() that stock is bigger than sortingUsingComparable.stock
    public int compareTo (SortingUsingComparable sortingUsingComparable) {
        if (stock == sortingUsingComparable.stock)
            return 0;
        else if (stock > sortingUsingComparable.stock)
            return 1;
        else
            return -1;
    }

}
