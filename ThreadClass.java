public class ThreadClass {
    public static void main(String argvs[]) {
        Thread t = new Thread("My thread");
        t.start();
        // getting the thread name by invoking the getName() method
        String str = t.getName();
        System.out.println(str);
    }
}