import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    
    static int counter = 0;
    
    public static void main(String[] args) {
        // PUVODNE:
        // task(); // counter value: 10000
        // task(); // counter: 20000
        // ted to ale chceme splitnout na thready:

        // abychom nemuseli psat pro kazdy thread thread.join() v try/catch blocku, tak pouzijeme latch 
        CountDownLatch latch = new CountDownLatch(2); // pocet tasku, ktere potrebujeme nechat probehnout
        // musime pridat lock, protoze jinak ty thready budou oba zaroven updatovat ten counter a dostaneme se k nespravnemu vysledku.
        ReentrantLock lock = new ReentrantLock();
        // Thread thread1 = new Thread(() -> task(lock, latch));
        // Thread thread2 = new Thread(() -> task(lock, latch));
        // thready nahradime thread poolem:
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        executorService.submit(() -> task(lock, latch));
        executorService.submit(() -> task(lock, latch));

        // thread1.start();
        // thread2.start();

        try {
            // thread1.join();
            // thread2.join();
            // misto thread.join(), pouzijeme:
            latch.await();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }

        System.out.println(counter); // pred pouzitim locku - dostanu 15429, neni to spravne. 
        // po pouziti locku: 20000
    }
    
    public static void task(ReentrantLock lock, CountDownLatch latch) {
        for (int i = 0; i < 10000; i++) {
            // lock.lock() lockne tu promennou pro ten dany thread. Jak se provede ta operace, tak se to unlockne a dalsi thread tu variable muze pouzit.
            lock.lock();
            counter++;
            lock.unlock();
        }
        // after finishing the task we countdownujeme latch:
        latch.countDown();
    }
  
}
