public class multiThreading {
    public static void main(String[] args) {
        
        // Multithreading: Enables the program to run multiple threads concurrentl
        // (Thread: A set of instruction that run independently.)
        // Useful for background task and time-consuming operations
         
        
        Thread thread1 = new Thread(new multiRunnable("ping"));
        Thread thread2 = new Thread(new multiRunnable("pong"));

        thread1.start();
        thread2.start();

        System.out.println("GAME START");
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread was interrupted.");
        }
        System.out.println("GAME OVER");
    }
}
