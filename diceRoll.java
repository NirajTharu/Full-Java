import java.util.Random;
import java.util.Scanner;

public class diceRoll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Dice roll Program

        int numOfDice;
        int total = 0;
        System.out.println("Enter the nubmer of dice you want to roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0)
        {
            for(int i = 1;i <= numOfDice; i++)
            {
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You roll: " + roll + " in number "+ i + " Dice.");
                total += roll;
            }
            System.out.println("The total is: " + total);
        }else{
            System.out.println("The number of dice should be grater than 0.");
        }
        // Declare variables
        // Get the number of dice from the user
        // Check if the number of dice is greater than 0
        // Roll all the dice
        // Get the total 
        // Display ASCII ART Of DICE
        scanner.close(); 
    }
    static void printDie(int roll)
    {
        String dice1 =
        """ 
          ---------
         |         | 
         |    ⏺    |
         |         |
          ---------
        """; 
         String dice2 =
        """ 
          ---------
         | ⏺       | 
         |         |
         |       ⏺ |
          ---------
        """; 
         String dice3 =
        """ 
          ---------
         | ⏺       | 
         |    ⏺    |
         |       ⏺ |
          ---------
        """; 
         String dice4 =
        """ 
          ---------
         | ⏺     ⏺ | 
         |         |
         | ⏺     ⏺ | 
          ---------
        """; 
         String dice5 =
        """ 
          ---------
         | ⏺     ⏺ | 
         |    ⏺    |
         | ⏺     ⏺ |
          ---------
        """; 
         String dice6 =
        """ 
          ---------
         | ⏺  ⏺  ⏺ | 
         | ⏺  ⏺  ⏺ |
         | ⏺  ⏺  ⏺ |
          ---------
        """; 
        switch (roll) {
            case 1:
                System.out.print(dice1);
                break;
            case 2:
                System.out.println(dice2);
                break;
            case 3 :
                System.out.println(dice3);
                break;
            case 4:
                System.out.println(dice4);
                break;
            case 5:
                System.out.println(dice5);
                break;
            case 6:
                System.out.println(dice6);
                break;
        
            default:
                System.out.println("Invalid roll.");
                break;
        }
    }
}
