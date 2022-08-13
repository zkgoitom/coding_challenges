import java.util.Arrays;

public class LoopArrayAndSortArray {
    public static void main (String [] args){
       String student [] =  {"am\n", "I\n", "student\n", "rev\n"};


       // loops through the student array before it's sorted
       for (int stud = 0; stud < student.length; stud++) {
           System.out.print(student[stud]);
       }
        // sorts the student array in ascending order which seems to be the same as sorting it according to length of the string
       Arrays.sort(student);

        System.out.println("\n");
       // for each loop that loops through student array after it's been sorted and prints it to each line rather than just
        //
       for (String stud: student) {
           System.out.println(stud);
       }




    }
}
