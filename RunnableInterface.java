class RunnableInterface implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
RunnableInterface m1=new RunnableInterface();  
Thread t1 =new Thread(m1,"My Thread");    
t1.start(); 
String str = t1.getName();  
System.out.println(str);   
 }  
}  