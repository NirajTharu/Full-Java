import java.util.Scanner;

public class threading {
    public static void main(String[] args) {
        
        // Threading: Allows a program to run multiple task simultaniously, Helps imporve performance with time-consuming opeartions
        //(File I/O, Network communicatons, or any background tasks)
         
        // How to creat a therad
        // Option 1: Extned the thread class(simpler)
        // Option 2: Implement the runnable interface(better)

        myRunnable myRunnable = new myRunnable();
        Thread thread  = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name.");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi "+name);
        scanner.close();
    }
}
 