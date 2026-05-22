import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        
        // While Loop: repeat some code forever while some condition remains true
        Scanner scanner = new Scanner(System.in);

        String  name = "";
        while(name.isEmpty())
        {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name );

        String response = "";
        while (!response.equals("Q")) {
            System.out.println("Your are playing a game. ");
            System.out.print("Press 'Q' to quit.");
            response= scanner.next().toUpperCase() ; 
        }
        System.out.println("You have quit the game!");

        int age = 0;
        System.out.println("Enter your age");
        age = scanner.nextInt();
        while (age < 0) {
            System.out.println("Your age can't be zero or less than zero.");
            System.out.println("Enter your age");
            age = scanner.nextInt();
        }
        System.out.println("You are " +age + " years old.");

        int number = 0;

        while(number < 1 || number > 10)
        {
             System.out.println("Enter the number between 1 - 10: ");
             number = scanner.nextInt(); 
        }
        System.out.println("You picked " + number);
        int number1 = 0;
        do{
            System.out.println("Pick a mumber from 11 to 20: ");
            number1 = scanner.nextInt();
        }while(number < 10 || number1 > 20);
        System.out.println("You picked "+ number1);
        scanner.close();
    }
}
