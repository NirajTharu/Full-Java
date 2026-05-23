import java.util.Scanner;

public class countdown {
    public static void main(String[] args) throws InterruptedException {
        
        // A count down program
        Scanner scanner = new Scanner(System.in);

        int countDown;
        System.out.println("How many seconds you want to count down? " );
        countDown = scanner.nextInt();

        for(int i = countDown;i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }

        scanner.close();
    }
}