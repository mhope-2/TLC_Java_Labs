package BasicConcurrency;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Engine {

    ExecutorService executor = Executors.newFixedThreadPool(5);


    void dispatch (Task task, int param) {
        task.execute(param);
        executor.execute(task);
    }

    public void shutdown() throws InterruptedException {
        try{

            if (!executor.awaitTermination(10, TimeUnit.SECONDS)){
                executor.shutdown(); // shutdown thread pool
                System.out.println("Act: "+ Thread.activeCount());

            }
        }
      catch (InterruptedException ie){
            ie.printStackTrace();
          executor.shutdown(); // shutdown thread pool
      }
    }
}
