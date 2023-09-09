public class MultiThread {

    // V tomhle pripade se nejdrive printne to "Doing other work on main thread" a pak az to "Finished long task"
    public static void main(String[] args) {
        // VARIANTA 1
        // Runnable runnable = new Runnable() {
        //     @Override
        //         public void run() {
        //             longTask();
        //         }
        // };
        // Thread thread2 = new Thread(runnable);

        // VARIANTA 2
        Thread thread2 = new Thread(() -> longTask());
        thread2.start(); // thread starts the new thread, once the thread is started, it runs the tasks by invoking the run method
        System.out.println("Doing other work on main thread");
        
    }

    public static void longTask() {
        long t= System.currentTimeMillis();
        long end = t+3000;

        while(true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }

}
