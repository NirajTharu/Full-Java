import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number;
        // for loop: Excecutes some code a certain amount of time:
        for(int i=0;i<12;i++)
        {
            System.out.println(i);
        }
        for(int i = 10; i > 0; i--)
        {
            System.out.println(i);
        }
        System.out.println("How many times you want to loop?");
        number = scanner.nextInt();
        for(int i = 0;i < number;i++)
        {
            System.out.println("Good to see you");
        }

        int start = 10;
        for(int i = start; i >0 ;i--)
        {
            System.out.println(i);
        }
        System.out.println("Happy New year!");
         
    }
}
