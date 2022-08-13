// This class will showcase multi-threading. the process of running multiple threads concurrently
//              2 mechanisms to implement multithreading
//                      1st way is to extend the thread class
//                      2nd way is to implement the runnable interface
public class MultiThread extends Thread{

    public void run () {
        System.out.println("thread " + Thread.currentThread().getId() + " is running");
    }

}
