package BasicConcurrency;

public class RunnableCounter implements Runnable{

    private final int sleepTime;

    public String getTaskName() {
        return taskName;
    }

    private final String taskName;
    int counterValue = 0;

    public RunnableCounter(String taskName) {

        this.taskName = taskName;
        this.sleepTime = 1000;


    }

    public int getCounterValue() {
        return counterValue;
    }


    @Override
    public void run() {

        while(!Thread.interrupted()){
            this.counterValue++;
            System.out.println(this.counterValue);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt(); //re-interrupt the thread
            }
        }

    }



}
