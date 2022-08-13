

public class SortArrayStringLength {

    //function to Sort the array of string according to length
    // this function implements Insertion Sort
    public void sort(String [] s, int n) {


        for (int i = 1; i < n;  i++) {
            String temp = s[i];

            int j = i - 1;

            while (j >= 0 && temp.length() < s[j].length()) {
                s[j + 1] = s[j];
                j--;
            }
            s[j+1] = s[j];
        }

    }
}
