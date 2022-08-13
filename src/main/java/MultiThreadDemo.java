
public class MultiThreadDemo {

    public static void main (String [] args) {

        int numberOfThreads = 5;

        for (int i = 0; i <= numberOfThreads; i++) {
            MultiThread thread = new MultiThread();
            thread.start();
        }

    }


}
