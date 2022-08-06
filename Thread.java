import java.io.FileNotFoundException;

class mythread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        mythread t1 = new mythread();
        t1.start();
        String str = t1.getName();
        System.out.println(str);
    }
}
