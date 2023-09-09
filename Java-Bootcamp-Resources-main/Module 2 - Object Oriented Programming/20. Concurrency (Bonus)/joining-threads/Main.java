import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    static final double[] targets = { 0.5, 0.8, 0.1};
    static final double PRECISION = 0.000001;

    static double result = 0;

    public static void main(String[] args) {

        // VARIANTA S THREAD POOLEM:
        System.out.println(Runtime.getRuntime().availableProcessors()); // 16
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); // ideal number of threads = number of cores
        Future<Double> future = executorService.submit(() -> generateNumber(0)); // muzeme submittnout runnable  i callable task
        // a taky nemusime psat thread.start()
        Future<Double> future2 =executorService.submit(() -> generateNumber(1));
        Future<Double> future3 =executorService.submit(() -> generateNumber(2)); 

        // VARIANTA 1:
        // Callable<Double> callable = () -> generateNumber(0);
        // //Thread thread = new Thread(callable); // TAKHLE TO PRIMO NEJDE, musi se vytvorit ten future task
        // FutureTask<Double> futureTask = new FutureTask<Double>(callable);
        // Thread thread = new Thread(futureTask);

        // VARIANTA 2
        // Runnable runnable = () -> result = generateNumber();
        // Thread thread = new Thread(runnable);

        //thread.start();

        // PRO VARIANTU 1:
        try {
            future.get();
            future2.get();
            future3.get();
            executorService.shutdown(); // thready dokonci sve ukoly a pokud uz je na nic dal nepotrebujeme, tak je musime shutdownout
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // PRO VARIANTU 2:
        // try {
        //     thread.join();
        // } catch (InterruptedException e) {
        //     System.out.println(e.getMessage());
        // }
        
        double difference = difference(result, 0);

        System.out.println("The computer returned a value of: " + result);
        System.out.println("The value was generated to a precision of : " + difference);
    }

    public static double generateNumber(int index) {
        double number = Math.random();
        double difference = difference(number, index);
        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number,index);
        }
        return number;
    }
     
    public static double difference(double number, int index) {
        return Math.abs(targets[index] - number);
    }


}
