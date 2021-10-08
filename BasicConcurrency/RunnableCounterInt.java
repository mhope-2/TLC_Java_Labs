package BasicConcurrency;


public class RunnableCounterInt {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter runnableCounter = new RunnableCounter("t1");
        RunnableCounter runnableCounter2 = new RunnableCounter("t2");

        Thread t1 = new Thread(runnableCounter);
        t1.start();
        System.out.println(runnableCounter.getTaskName() + " started");
        System.out.println("no. of threads: " + Thread.activeCount());

        Thread t2 = new Thread(runnableCounter);
        t2.start();
        System.out.println(runnableCounter2.getTaskName() + " started");
        System.out.println("no. of threads: " + Thread.activeCount());


         try{  
          t2.join();
          System.out.println("after join no. of threads: " + Thread.activeCount());
         }catch(Exception e){System.out.println(e);
         }  System.out.println(runnableCounter2.getTaskName() + " joined");
    }
}
