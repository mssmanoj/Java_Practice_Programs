package basic.problems.multithreading_executorServices.executor;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<= 10;i++){
            System.out.println(i);
        }
    }
}
