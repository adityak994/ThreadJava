import java.util.*;
public class ThreadDemo1 extends Thread {
    public void run()
    {
        // gets the name of current thread
        System.out.println(
            "Current Thread Name: "
            + Thread.currentThread().getName());
    }
    public static void main(String[] args)
        throws InterruptedException
    {
        Scanner s = new Scanner(System.in);
        
        // creating first thread
        ThreadDemo1 t1 = new ThreadDemo1();
        
        // creating second thread
        ThreadDemo1 t2 = new ThreadDemo1();
        
        // Starting the thread
        t1.start();
        t2.start();
        
        // t2 does not start execution until t1 completes
        // execution
        t1.join();
    }
}