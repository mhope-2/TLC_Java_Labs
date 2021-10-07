package BasicConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class IncCounnter {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();

        Thread thread = new Thread(()->{
            while (true){
                counter.getAndIncrement();
                System.out.println(counter);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
