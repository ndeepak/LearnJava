package concurrencyPackage;

import static java.lang.Thread.currentThread;

public class ThreadStopTest 
{
   public static void main(String args[]) throws InterruptedException 
   {
      UserThread userThread = new UserThread();
      Thread thread = new Thread(userThread, "T1");
      thread.start();
      System.out.println(currentThread().getName() + " is stopping user thread");
      userThread.stop();
      Thread.sleep(5000);
      System.out.println(currentThread().getName() + ", After 5 Seconds is finished now");
   }
}
class UserThread implements Runnable 
{
   private volatile boolean exit = false;
   public void run() 
   {
      while(!exit) 
      {
         System.out.println("The user thread is running");
      }
      System.out.println("The user thread is now stopped");
   }
   public void stop() 
   {
      exit = true;
   }
}