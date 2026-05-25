import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        
        // Rock paper scissor Game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare variables
        String[] choices = {"rock","paper","scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain ="yes";
         
        // Get the choice form the user
        do
        {
            System.out.println("Enter your choice among Rock-Paper-Scissor: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor"))
            {
                System.out.println("Invalid Choice");
                continue;
            }
            
            // Get random choice from the computer 
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice is: " + computerChoice);

            if(playerChoice.equals(computerChoice))
            {
                System.out.println("It's tie!");
            }

            // Check win condition
            else if
            (
                ((playerChoice.equals("rock") && computerChoice.equals("scissor"))) || 
                 ((playerChoice.equals("paper") && computerChoice.equals("rock") )) ||
                 ((playerChoice.equals("scissor") && computerChoice.equals("paper")))
            )
            {   
            System.out.println("You win!");
            }
            else
            {
                System.out.println("You lose!");
            }
            // Ask to play again
            System.out.println("Play Again yes/no: ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));
        
        // Good bye message
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
